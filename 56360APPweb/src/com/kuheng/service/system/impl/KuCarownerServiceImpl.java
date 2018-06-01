package com.kuheng.service.system.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuCarownerMapper;
import com.kuheng.entity.member.KuCarowner;
import com.kuheng.service.system.KuCarownerService;

@Service("/kuCarownerService")
public class KuCarownerServiceImpl implements KuCarownerService{
	@Resource
	private KuCarownerMapper kuCarownerMapper;
	@Override
	public KuCarowner selectByPrimaryKey(Long userid) {
		// TODO Auto-generated method stub
		return kuCarownerMapper.selectByPrimaryKey(userid);
	}
	
	@Override
	public KuCarowner selectByCarNo(String carNo) {
		// TODO Auto-generated method stub
		return kuCarownerMapper.selectByCarNo(carNo);
	}

}
