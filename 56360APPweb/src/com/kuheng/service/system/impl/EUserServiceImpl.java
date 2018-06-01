package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.EUserMapper;
import com.kuheng.entity.member.EUser;
import com.kuheng.service.system.EUserService;


@Service("/eUserService")
public class EUserServiceImpl implements EUserService {

	@Resource
	private EUserMapper eUserMapper;
	@Override
	public EUser selectByPrimaryKey(Integer userId) {
		// TODO Auto-generated method stub
		return eUserMapper.selectByPrimaryKey(userId);
	}
	@Override
	public List<Map<String,Object>> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return eUserMapper.selectPaging(param);
	}
	@Override
	public EUser selectByMobile(String mobile) {
		// TODO Auto-generated method stub
		return eUserMapper.selectByMobile(mobile);
	}
	@Override
	public int updateByPrimaryKeySelective(EUser record) {
		// TODO Auto-generated method stub
		return eUserMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public List<EUser> selectByCompanyName(Map<String,Object> param) {
		// TODO Auto-generated method stub
		return eUserMapper.selectByCompanyName(param);
	}
	@Override
	public List<EUser> selectByCompanyLocation(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return eUserMapper.selectByCompanyLocation(param);
	}
	@Override
	public List<EUser> selectByLine(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return eUserMapper.selectByLine(param);
	}
	@Override
	public List<EUser> selectByRealName(String realName) {
		// TODO Auto-generated method stub
		return eUserMapper.selectByRealName(realName);
	}
	
}
