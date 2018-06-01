package com.kuheng.service.system.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuLocationMapper;
import com.kuheng.entity.member.KuLocation;
import com.kuheng.service.system.KuLocationService;
@Service("kuLocationServiceImpl")
public class KuLocationServiceImpl implements KuLocationService{
	
	@Resource
	private KuLocationMapper kuLocationMapper;
		
	@Override
	public int delete(Integer itemid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int save(KuLocation record) {
		// TODO Auto-generated method stub
		return kuLocationMapper.insert(record) ;
	}

	@Override
	public int insertSelective(KuLocation record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public KuLocation selectByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		return kuLocationMapper.selectByPrimaryKey(itemid);
	}

	@Override
	public int updateByPrimaryKeySelective(KuLocation record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(KuLocation record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
