package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuSendorders;

public interface KuSendordersService {

	public void  save(KuSendorders bean );
	
	public List<KuSendorders> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public KuSendorders selectByPrimaryKey(Long itemid);

	public void  update(KuSendorders bean) ;
	
	public void  delete(Long itemid );
	
}
