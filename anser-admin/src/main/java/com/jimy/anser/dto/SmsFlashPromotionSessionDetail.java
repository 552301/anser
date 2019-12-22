package com.jimy.anser.dto;

import com.jimy.anser.model.SmsFlashPromotionSession;
import lombok.Getter;
import lombok.Setter;

/**
 * 包含商品数量的场次信息
 * Created by jimy on 2018/11/19.
 */
public class SmsFlashPromotionSessionDetail extends SmsFlashPromotionSession {
    @Setter
    @Getter
    private Long productCount;
}
