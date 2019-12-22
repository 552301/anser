package com.jimy.anser.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by jimy on 2019/4/8.
 */
@Configuration
@MapperScan({"com.jimy.anser.mapper","com.jimy.anser.search.dao"})
public class MyBatisConfig {
}
