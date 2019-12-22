package com.jimy.anser.service;

import com.jimy.anser.dto.OssCallbackResult;
import com.jimy.anser.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * oss上传管理Service
 * Created by jimy on 2018/5/17.
 */
public interface OssService {
    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();
    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
