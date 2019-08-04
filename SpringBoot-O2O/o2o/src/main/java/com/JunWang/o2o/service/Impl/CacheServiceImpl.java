package com.JunWang.o2o.service.Impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.JunWang.o2o.cache.JedisUtil;
import com.JunWang.o2o.service.CacheService;

public class CacheServiceImpl implements CacheService{
	@Autowired
	private JedisUtil.Keys jedisKeys;

	@Override
	public void removeFromCache(String keyPrefix) {
		Set<String> keySet = jedisKeys.keys(keyPrefix + "*");
		for (String key : keySet) {
			jedisKeys.del(key);
		}
	}

}
