package com.JunWang.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.JunWang.o2o.entity.ShopCategory;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopCategoryDaoTest {
	@Autowired
	private ShopCategoryDao shopCategoryDao;
	
	@Test
	public void testQueryShopCategory() {
		List<ShopCategory> shopCategoryList = shopCategoryDao.queryShopCategory(null);
		assertEquals(1, shopCategoryList.size());
		/*
		 * ShopCategory testCategory = new ShopCategory(); ShopCategory parentCategory =
		 * new ShopCategory(); parentCategory.setShopCategoryId(1L);
		 * testCategory.setParent(parentCategory); shopCategoryList =
		 * shopCategoryDao.queryShopCategory(testCategory); assertEquals(1,
		 * shopCategoryList.size());
		 * System.out.println(shopCategoryList.get(0).getShopCategoryName());
		 */
	}
	
}
