package com.kuheng.dao;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuCheZhuLine;

public interface KuCheZhuLineMapper {
  
    int deleteByPrimaryKey(Integer id);

    int insert(KuCheZhuLine record);

    int insertSelective(KuCheZhuLine record);

    KuCheZhuLine selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(KuCheZhuLine record);

    int updateByPrimaryKey(KuCheZhuLine record);
    
    List<Map<String,Object>> selectline(Integer userid);
}