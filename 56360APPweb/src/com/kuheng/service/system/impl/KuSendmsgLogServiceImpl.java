package com.kuheng.service.system.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuSendmsgLogMapper;
import com.kuheng.entity.member.KuSendmsgLog;
import com.kuheng.service.system.KuSendmsgLogService;

@Service("kuSendmsgLogService")
public class KuSendmsgLogServiceImpl implements KuSendmsgLogService{
	@Resource
	private KuSendmsgLogMapper kuSendmsgLogMapper;
	@Override
	public void save(KuSendmsgLog bean) {
//		int i =kuSendmsgLogMapper.insert(bean);
	}
	@Override
	public void insert1(Map<String, Object> map) {
		kuSendmsgLogMapper.insert1(map);		
	}
	@Override
	public KuSendmsgLog selectByPrimaryKey(Integer itemid) {
	
		return kuSendmsgLogMapper.selectByPrimaryKey(itemid);
	}

}