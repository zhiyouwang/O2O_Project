package com.JunWang.o2o.dao;

import java.util.List;

import com.JunWang.o2o.entity.ProductImg;

public interface ProductImgDao {
	
	/**
	 * 列出某个商品的详情图列表
	 * @param productId
	 * @return
	 */
	List<ProductImg> queryProductImgList(long productId);
	
	/**
	 * 批量添加商品详情图片
	 * @param productImgList
	 * @return
	 */
	int batchInsertProductImg(List<ProductImg> productImgList);
	
	/**
	 * 删除指定商品下的所有详情图片
	 * @param producrId
	 * @return
	 */
	int deleteProductImgByProductId(long producrId);

}
