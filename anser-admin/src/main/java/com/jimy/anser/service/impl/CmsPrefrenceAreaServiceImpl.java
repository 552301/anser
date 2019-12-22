package com.jimy.anser.service.impl;

import com.jimy.anser.mapper.CmsPrefrenceAreaMapper;
import com.jimy.anser.model.CmsPrefrenceArea;
import com.jimy.anser.model.CmsPrefrenceAreaExample;
import com.jimy.anser.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选Service实现类
 * Created by jimy on 2018/6/1.
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
