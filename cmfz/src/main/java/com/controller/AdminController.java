package com.controller;

import com.entity.Admin;
import com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
@ResponseBody
public class AdminController {
    @Autowired
    AdminService adminService;

    @RequestMapping("login")

    public Admin login(Admin admin, HttpSession session) {
        Admin login = adminService.login(admin);
        session.setAttribute("login", login);
        return login;
    }
}
