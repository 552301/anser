package com.jimy.anser.config;

import com.jimy.anser.security.config.SecurityConfig;
import com.jimy.anser.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * anser-security模块相关配置
 * Created by jimy on 2019/11/5.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class AnserSecurityConfig extends SecurityConfig {

    @Autowired
    private UmsAdminService adminService;

    @Bean
    public UserDetailsService userDetailsService() {
        //获取登录用户信息
        return username -> adminService.loadUserByUsername(username);
    }
}
