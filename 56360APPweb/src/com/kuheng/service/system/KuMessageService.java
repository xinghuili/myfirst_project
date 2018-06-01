package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuMessage;


public interface KuMessageService {
	
	public void  save(KuMessage bean );
	
	public List<KuMessage> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public KuMessage selectByPrimaryKey(Integer itemid);

	public void  update(KuMessage bean) ;
	
	public void  delete(Integer itemid );
	
	public List<KuMessage> selectByUserId(Integer userId); 
}
