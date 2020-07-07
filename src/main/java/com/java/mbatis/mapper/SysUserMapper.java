package com.java.mbatis.mapper;

import com.java.mbatis.entity.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserMapper {

    List<SysUser> getAllUser();
}
