package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuCancelorders;

public interface KuCancelordersService {

	public void  save(KuCancelorders bean );
	
	public List<KuCancelorders> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public KuCancelorders selectByPrimaryKey(Long itemid);

	public void  update(KuCancelorders bean) ;
	
	public void  delete(Long itemid );
	
}
