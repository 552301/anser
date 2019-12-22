package com.jimy.anser.dao;

import com.jimy.anser.dto.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * 商品分类自定义Dao
 * Created by jimy on 2018/5/25.
 */
public interface PmsProductCategoryDao {
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
