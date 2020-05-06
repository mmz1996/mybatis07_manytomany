package com.mmz.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Classname Role
 * @Description TODO
 * @Date 2020/5/6 20:39
 * @Created by mmz
 */
@Data
public class Role implements Serializable {
    private  Integer roleId;
    private String roleName;
    private String roleDesc;

    private List<User> users;

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                '}';
    }
}
