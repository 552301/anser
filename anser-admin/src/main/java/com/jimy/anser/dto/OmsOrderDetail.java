package com.jimy.anser.dto;

import com.jimy.anser.model.OmsOrder;
import com.jimy.anser.model.OmsOrderItem;
import com.jimy.anser.model.OmsOrderOperateHistory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 订单详情信息
 * Created by jimy on 2018/10/11.
 */
public class OmsOrderDetail extends OmsOrder {
    @Getter
    @Setter
    private List<OmsOrderItem> orderItemList;
    @Getter
    @Setter
    private List<OmsOrderOperateHistory> historyList;
}
