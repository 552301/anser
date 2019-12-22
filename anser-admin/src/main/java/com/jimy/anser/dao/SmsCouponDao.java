package com.jimy.anser.dao;

import com.jimy.anser.dto.SmsCouponParam;
import org.apache.ibatis.annotations.Param;

/**
 * 优惠券管理自定义查询Dao
 * Created by jimy on 2018/8/29.
 */
public interface SmsCouponDao {
    SmsCouponParam getItem(@Param("id") Long id);
}
