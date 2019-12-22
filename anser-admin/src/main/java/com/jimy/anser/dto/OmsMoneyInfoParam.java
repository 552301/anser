package com.jimy.anser.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 修改订单费用信息参数
 * Created by jimy on 2018/10/29.
 */
@Getter
@Setter
public class OmsMoneyInfoParam {
    private Long orderId;
    private BigDecimal freightAmount;
    private BigDecimal discountAmount;
    private Integer status;
}
