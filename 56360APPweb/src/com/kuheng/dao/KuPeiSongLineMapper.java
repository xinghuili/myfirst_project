package com.kuheng.dao;

import com.kuheng.entity.member.KuPeiSongLine;

public interface KuPeiSongLineMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(KuPeiSongLine record);

    int insertSelective(KuPeiSongLine record);

    KuPeiSongLine selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(KuPeiSongLine record);

    int updateByPrimaryKey(KuPeiSongLine record);
}