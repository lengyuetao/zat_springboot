package com.tao.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.tao.demo.dao.FileInfoDao;
import com.tao.demo.domain.FileInfo;
import com.tao.demo.domain.UserInfo;
import com.tao.demo.service.UserInfoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by DELL on 2017/7/11.
 */
@RestController
public class IndexController {

    private Logger log=Logger.getLogger(IndexController.class);

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private FileInfoDao fileInfoDao;

    @RequestMapping(value="/index",method = RequestMethod.GET)
    public UserInfo getData(@RequestParam(value="id")Long id){
        System.out.println("欢迎进入springboot的世界");
        UserInfo userInfo=userInfoService.getUserInfo(id);

        System.out.println("********");

        FileInfo fileInfo=new FileInfo();
        fileInfo.setId(3);
        fileInfo.setFileName("图片");
        fileInfo.setFileName("E://");
        fileInfo.setAddTime(new Date());

        fileInfoDao.insert(fileInfo);

        return userInfo;
    }
}
