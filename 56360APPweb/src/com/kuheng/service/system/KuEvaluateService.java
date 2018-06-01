package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuEvaluate;

public interface KuEvaluateService {

	public int  save(KuEvaluate bean );
	
	public List<KuEvaluate> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public KuEvaluate selectByPrimaryKey(Long orderId);

	public void  update(KuEvaluate bean) ;
	
	public void  delete(Integer itemid );
	
}
