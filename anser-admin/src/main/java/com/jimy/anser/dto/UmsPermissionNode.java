package com.jimy.anser.dto;

import com.jimy.anser.model.UmsPermission;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by jimy on 2018/9/30.
 */
public class UmsPermissionNode extends UmsPermission {
    @Getter
    @Setter
    private List<UmsPermissionNode> children;
}
