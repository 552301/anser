package com.jimy.anser.dao;

import com.jimy.anser.model.SmsCouponProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 优惠券和产品关系自定义Dao
 * Created by jimy on 2018/8/28.
 */
public interface SmsCouponProductRelationDao {
    int insertList(@Param("list")List<SmsCouponProductRelation> productRelationList);
}
