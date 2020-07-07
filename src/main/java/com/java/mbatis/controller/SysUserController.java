package com.java.mbatis.controller;

import com.java.mbatis.entity.SysUser;
import com.java.mbatis.services.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private ISysUserService userService;

    @RequestMapping("/all")
    public List<SysUser> getAll(){
        return userService.getAll();
    }
}
