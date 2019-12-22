package com.jimy.anser.dao;

import com.jimy.anser.model.PmsProductAttributeValue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品参数，商品自定义规格属性Dao
 * Created by jimy on 2018/4/26.
 */
public interface PmsProductAttributeValueDao {
    int insertList(@Param("list")List<PmsProductAttributeValue> productAttributeValueList);
}
