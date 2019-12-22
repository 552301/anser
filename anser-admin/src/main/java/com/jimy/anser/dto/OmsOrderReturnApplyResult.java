package com.jimy.anser.dto;

import com.jimy.anser.model.OmsCompanyAddress;
import com.jimy.anser.model.OmsOrderReturnApply;
import lombok.Getter;
import lombok.Setter;

/**
 * 申请信息封装
 * Created by jimy on 2018/10/18.
 */
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    @Getter
    @Setter
    private OmsCompanyAddress companyAddress;
}
