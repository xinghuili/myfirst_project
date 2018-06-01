package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuOrders;


public interface KuOrdersService {

	public void  save(KuOrders bean );
	
	public List<KuOrders> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public KuOrders selectByPrimaryKey(long itemid);

	public void  update(KuOrders bean) ;
	
	public void  delete(long itemid );
	
}
