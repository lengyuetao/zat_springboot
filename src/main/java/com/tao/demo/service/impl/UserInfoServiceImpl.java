package com.tao.demo.service.impl;

import com.tao.demo.domain.UserInfo;
import com.tao.demo.mapper.UserInfoMapper;
import com.tao.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DELL on 2017/7/20.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public int add(UserInfo userInfo) {
        return userInfoMapper.add(userInfo);
    }

    @Override
    public int update(UserInfo userInfo) {
        return userInfoMapper.update(userInfo);
    }

    @Override
    public int delete(long id) {
        return userInfoMapper.delete(id);
    }

    @Override
    @Cacheable(value="userInfo",key = "'index_userInfo_'+#id")
    public UserInfo getUserInfo(long id) {
        return userInfoMapper.getUserInfo(id);
    }

    @Override
    public List<UserInfo> getList() {
        return userInfoMapper.getList();
    }
}
