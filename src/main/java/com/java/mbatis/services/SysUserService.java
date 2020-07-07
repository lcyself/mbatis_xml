package com.java.mbatis.services;

import com.java.mbatis.entity.SysUser;
import com.java.mbatis.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserService implements ISysUserService {

    @Autowired
    private SysUserMapper userMapper;

    @Override
    public List<SysUser> getAll() {
        return userMapper.getAllUser();
    }
}
