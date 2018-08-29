package com.dao;

import com.entity.Admin;

import java.util.List;

public interface AdminDao {
    //登陆
    public Admin queryAdminByUsername(Admin admin);

    //注册
    public void insertAdmin(Admin admin);

    //删除
    public void deleteAdmin(Integer id);

    //查所有
    public List<Admin> queryAll();

}
