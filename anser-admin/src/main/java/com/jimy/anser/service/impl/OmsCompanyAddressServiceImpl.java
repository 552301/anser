package com.jimy.anser.service.impl;

import com.jimy.anser.mapper.OmsCompanyAddressMapper;
import com.jimy.anser.model.OmsCompanyAddress;
import com.jimy.anser.model.OmsCompanyAddressExample;
import com.jimy.anser.service.OmsCompanyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收货地址管理Service实现类
 * Created by jimy on 2018/10/18.
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
