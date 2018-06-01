package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuAdmin;


public interface KuAdminService {
	public void  save(KuAdmin bean );
	
	public List<KuAdmin> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public KuAdmin selectByPrimaryKey(Integer itemid);

	public void  update(KuAdmin bean) ;
	
	public void  delete(Integer itemid );
	
	public KuAdmin selectByName(String adminName);
	
}
