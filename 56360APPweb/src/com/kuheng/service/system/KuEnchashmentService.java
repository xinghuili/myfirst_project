package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuEnchashment;

public interface KuEnchashmentService {
	
	
	public int  save(KuEnchashment bean);
	
	public List<KuEnchashment> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public KuEnchashment selectByPrimaryKey(Long itemid);

	public void  update(KuEnchashment bean) ;
	
	public void  delete(Long itemid );
	
}
