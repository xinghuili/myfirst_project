package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuGadmin;

public interface KuGadminService {

	public void  save(KuGadmin bean );
	
	public List<KuGadmin> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public KuGadmin selectByPrimaryKey(Integer itemid);

	public void  update(KuGadmin bean) ;
	
	public void  delete(Integer itemid );
	
}
