package com.tao.demo.mapper;

import com.tao.demo.domain.UserInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by DELL on 2017/7/20.
 */
public interface UserInfoMapper {

    @Insert("insert into userInfo(userName,pwd,address,phone,regTime) values(#{userName},#{pwd},#{address},#{phone},now())")
    int add(UserInfo userInfo);

    @Update("update userInfo set userName=#{userName},pwd=#{pwd},address=#{address},phone=#{phone} where id=#{id}")
    int update(UserInfo userInfo);

    @Delete("delete userInfo where id=#{id}")
    int delete(long id);

    @Select("select * from userInfo where id=#{id}")
    UserInfo getUserInfo(long id);

    @Select("select * from userInfo")
    List<UserInfo> getList();

}
