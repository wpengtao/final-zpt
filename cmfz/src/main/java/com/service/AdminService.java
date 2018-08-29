package com.service;

import com.entity.Admin;

import java.util.List;

public interface AdminService {
    public Admin login(Admin admin);

    public void regist(Admin admin);

    public void delete(Integer id);

    public List<Admin> queryAll();
}
