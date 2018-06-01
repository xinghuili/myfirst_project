package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.EUser;

public interface EUserService {
	
	public EUser selectByPrimaryKey(Integer userId);
	
	public List<Map<String,Object>> selectPaging(Map param); 
	
	public EUser selectByMobile(String mobile);
	
	public List<EUser> selectByRealName(String realName); 
	
	public int updateByPrimaryKeySelective(EUser record);
	
	public List<EUser> selectByCompanyName(Map<String,Object> param); 
	
	public List<EUser> selectByCompanyLocation(Map<String,Object> param); 
	
	public List<EUser> selectByLine(Map<String,Object> param); 
}
