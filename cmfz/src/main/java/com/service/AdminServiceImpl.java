package com.service;

import com.dao.AdminDao;
import com.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin login(Admin admin) {
        return adminDao.queryAdminByUsername(admin);
    }

    @Override
    public void regist(Admin admin) {
        adminDao.insertAdmin(admin);
    }

    @Override
    public void delete(Integer id) {
        adminDao.deleteAdmin(id);
    }

    @Override
    public List<Admin> queryAll() {
        return adminDao.queryAll();
    }
}
