package com.jimy.anser.dao;

import com.jimy.anser.dto.PmsProductAttributeCategoryItem;

import java.util.List;

/**
 * 自定义商品属性分类Dao
 * Created by jimy on 2018/5/24.
 */
public interface PmsProductAttributeCategoryDao {
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
