package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuAdminWorklog;

public interface KuAdminWorklogService {

	public void  save(KuAdminWorklog bean );
	
	public List<KuAdminWorklog> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public KuAdminWorklog selectByPrimaryKey(Integer itemid);

	public void  update(KuAdminWorklog bean) ;
	
	public void  delete(Integer itemid );
	
}
