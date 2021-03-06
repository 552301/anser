package com.jimy.anser.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 * Created by jimy on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.jimy.anser.mapper","com.jimy.anser.dao"})
public class MyBatisConfig {
}
