package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuMessageMapper;
import com.kuheng.entity.member.KuMessage;
import com.kuheng.service.system.KuMessageService;

@Service("kuMessageService")
public class KuMessageServiceImpl implements KuMessageService{

	@Resource
	private KuMessageMapper kuMessageMapper;
	@Override
	public void save(KuMessage bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<KuMessage> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public KuMessage selectByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(KuMessage bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer itemid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<KuMessage> selectByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return kuMessageMapper.selectByUserId(userId);
	}

}
