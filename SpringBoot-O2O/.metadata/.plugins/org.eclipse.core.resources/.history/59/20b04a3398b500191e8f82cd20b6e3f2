package com.JunWang.o2o.dao;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import com.JunWang.o2o.BaseTest;
import com.JunWang.o2o.entity.ProductCategory;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProductCategoryDaoTest extends BaseTest{
	@Autowired
	private ProductCategoryDao productCategoryDao;
	
	@Test
	@Ignore
	public void testQueryByShopId() throws Exception {
		long shopId = 1;
		List<ProductCategory> productCategoryList = productCategoryDao
				.queryProductCategoryList(shopId);
		System.out.println("该店铺自定义类别为：" + productCategoryList.size());
	}

	@Test
	
	public void testABatchInsertProductCategory() {
		ProductCategory productCategory = new ProductCategory();
		productCategory.setProductCategoryName("商品类别1");
		productCategory.setPriority(1);
		productCategory.setCreateTime(new Date());
		productCategory.setShopId(1L);
		ProductCategory productCategory1 = new ProductCategory();
		productCategory1.setProductCategoryName("商品类别2");
		productCategory1.setPriority(2);
		productCategory1.setCreateTime(new Date());
		productCategory1.setShopId(1L);
		List<ProductCategory> productCategoryList = new ArrayList<ProductCategory>();
		productCategoryList.add(productCategory);
		productCategoryList.add(productCategory1);
		int effectNum = productCategoryDao.batchInsertProductCategory(productCategoryList);
		assertEquals(2, effectNum);
	}
	
	@Test
	public void testCDeleteProductCategory() throws Exception {
		long shopId = 1L;
		List<ProductCategory> productcategoryList = productCategoryDao.queryProductCategoryList(shopId);
		for (ProductCategory pc : productcategoryList) {
			if ("商品类别1".equals(pc.getProductCategoryName()) || 
					"商品类别2".equals(pc.getProductCategoryName())) {
				int effectedNum = productCategoryDao.deleteProductCategory(
						pc.getProductCategoryId(), shopId);
				assertEquals(1, effectedNum);
			}
		}
	}
}
