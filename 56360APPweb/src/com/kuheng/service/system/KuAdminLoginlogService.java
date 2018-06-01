package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuAdminLoginlog;

public interface KuAdminLoginlogService {

	public void  save(KuAdminLoginlog bean );
	
	public List<KuAdminLoginlog> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public KuAdminLoginlog selectByPrimaryKey(Integer itemid);

	public void  update(KuAdminLoginlog bean) ;
	
	public void  delete(Integer itemid );
	
}
