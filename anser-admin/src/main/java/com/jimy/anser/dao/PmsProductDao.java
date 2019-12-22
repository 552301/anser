package com.jimy.anser.dao;

import com.jimy.anser.dto.PmsProductResult;
import org.apache.ibatis.annotations.Param;


/**
 * 商品自定义Dao
 * Created by jimy on 2018/4/26.
 */
public interface PmsProductDao {
    /**
     * 获取商品编辑信息
     */
    PmsProductResult getUpdateInfo(@Param("id") Long id);
}
