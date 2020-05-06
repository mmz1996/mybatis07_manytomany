package com.mmz.dao;

import com.mmz.pojo.Role;

import java.util.List;

/**
 * @Classname RoleDao
 * @Description TODO
 * @Date 2020/5/6 20:52
 * @Created by mmz
 */
public interface RoleDao {

    List<Role> findAll();
    
}
