package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuKnowcarMapper;
import com.kuheng.entity.member.KuKnowcar;
import com.kuheng.service.system.KuKnowcarService;

@Service("kuKnowcarService")
public class KuKnowcarServiceImpl implements KuKnowcarService {
	@Resource
	private KuKnowcarMapper kuKnowcarMapper;
	
	@Override
	public int insert(KuKnowcar record) {
		// TODO Auto-generated method stub
		return kuKnowcarMapper.insert(record);
	}

	@Override
	public List<Map<String,Object>> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuKnowcarMapper.selectPaging(param);
	}

	@Override
	public int deleteByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		return kuKnowcarMapper.deleteByPrimaryKey(itemid);
	}

}
