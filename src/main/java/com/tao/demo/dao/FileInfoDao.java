package com.tao.demo.dao;

import com.tao.demo.domain.FileInfo;

import java.util.List;

/**
 * Created by DELL on 2017/7/24.
 */

public interface FileInfoDao {

    void insert(FileInfo fileInfo);

    void update(FileInfo fileInfo);

    void delete(int id);

    FileInfo findFileInfo(int id);

    List<FileInfo> getList();
}
