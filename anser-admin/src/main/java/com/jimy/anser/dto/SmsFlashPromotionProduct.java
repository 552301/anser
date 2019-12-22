package com.jimy.anser.dto;

import com.jimy.anser.model.PmsProduct;
import com.jimy.anser.model.SmsFlashPromotionProductRelation;
import lombok.Getter;
import lombok.Setter;

/**
 * 限时购及商品信息封装
 * Created by jimy on 2018/11/16.
 */
public class SmsFlashPromotionProduct extends SmsFlashPromotionProductRelation{
    @Getter
    @Setter
    private PmsProduct product;
}
