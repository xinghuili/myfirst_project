package com.kuheng.service.system.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;



import com.kuheng.dao.KuSenderMapper;
import com.kuheng.entity.member.KuSender;
import com.kuheng.service.system.KuSenderService;
@Service("kuSenderService")
public class KuSenderServiceImpl implements KuSenderService {
	@Resource
	private KuSenderMapper kuSenderMapper;
	@Override
	public KuSender selectByPrimaryKey(Long userid) {
		// TODO Auto-generated method stub
		return kuSenderMapper.selectByPrimaryKey(userid);
	}
	@Override
	public int insert(KuSender record) {
		// TODO Auto-generated method stub
		return kuSenderMapper.insertSelective(record);
	}

}
