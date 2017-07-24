package com.tao.demo.service;

import com.tao.demo.domain.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DELL on 2017/7/20.
 */
@Service
public interface UserInfoService {
    int add(UserInfo userInfo);

    int update(UserInfo userInfo);

    int delete(long id);

    UserInfo getUserInfo(long id);

    List<UserInfo> getList();
}
