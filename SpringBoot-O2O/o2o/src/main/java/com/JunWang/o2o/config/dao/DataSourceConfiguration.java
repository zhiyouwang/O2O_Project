package com.JunWang.o2o.config.dao;

import java.beans.PropertyVetoException;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.JunWang.o2o.util.DESUtil;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 配置mybatis mapper的扫描路径
 * 
 * @author boyWang
 *
 */
@Configuration
// 配置mybatis mapper的扫描路径
@MapperScan("com.JunWang.o2o.dao")
public class DataSourceConfiguration {
	@Value("${jdbc.driver}")
	private String jdbcDriver;
	@Value("${jdbc.url}")
	private String jdbcUrl;
	@Value("${jdbc.username}")
	private String jdbcUsername;
	@Value("${jdbc.password}")
	private String jdbcPassword;

	/**
	 * 申城与spring-dao.xml对应的bean DataSource
	 * 
	 * @return
	 * @throws PropertyVetoException 
	 */
	@Bean(name = "dataSource")
	public ComboPooledDataSource createDataSource() throws PropertyVetoException {
		// 生成datasource实例
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		// 跟配置文件一样设置以下信息
		// 驱动
		dataSource.setDriverClass(jdbcDriver);
		// 数据库连接URL
		dataSource.setJdbcUrl(jdbcUrl);
		// 设置用户名
		dataSource.setUser(DESUtil.getDecryptString(jdbcUsername));
		// 设置用户密码
		dataSource.setPassword(DESUtil.getDecryptString(jdbcPassword));
		// 配置c3p0连接池的私有属性
		// 连接池最大线程数
		dataSource.setMaxPoolSize(30);
		// 连接池最小线程数
		dataSource.setMinPoolSize(10);
		dataSource.setInitialPoolSize(10);
		// 关闭连接后不自动commit
		dataSource.setAutoCommitOnClose(false);
		// 连接超时时间
		dataSource.setCheckoutTimeout(10000);
		// 连接失败重试次数
		dataSource.setAcquireRetryAttempts(2);
		return dataSource;
	}
}
