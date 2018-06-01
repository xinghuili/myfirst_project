package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuKnowcar;

public interface KuKnowcarService {
	
	public int insert(KuKnowcar record);
	
	public List<Map<String,Object>> selectPaging(Map param); 
	
	public int deleteByPrimaryKey(Integer itemid);
}
