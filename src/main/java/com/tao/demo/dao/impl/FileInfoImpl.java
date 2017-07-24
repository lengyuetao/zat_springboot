package com.tao.demo.dao.impl;

import com.tao.demo.dao.FileInfoDao;
import com.tao.demo.domain.FileInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by DELL on 2017/7/24.
 */
@Component
public class FileInfoImpl implements FileInfoDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void insert(FileInfo fileInfo) {
        mongoTemplate.save(fileInfo);
    }

    @Override
    public void update(FileInfo fileInfo) {
        Query query=new Query(Criteria.where("id").is(fileInfo.getId()));
        Update update=new Update().set("fileName",fileInfo.getFileName()).set("fileUrl",fileInfo.getFileUrl());
        mongoTemplate.updateFirst(query,update,FileInfo.class);
    }

    @Override
    public void delete(int id) {
        Query query=new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,FileInfo.class);
    }

    @Override
    public FileInfo findFileInfo(int id) {
        return null;
    }

    @Override
    public List<FileInfo> getList() {
        return null;
    }
}
