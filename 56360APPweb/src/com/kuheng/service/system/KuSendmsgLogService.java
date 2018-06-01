package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuSendmsgLog;

public interface KuSendmsgLogService {

	public void  save(KuSendmsgLog bean );
	public void  insert1(Map<String,Object> map);
//	public List<KuSendmsgLog> selectPaging(Map param); 
//	
//	public int selectCount(Map param); 
//	
	public KuSendmsgLog selectByPrimaryKey(Integer itemid);
//	
//	public KuSendmsgLog selectByMobile(String mobile);
//
//	public void  update(KuSendmsgLog bean) ;
//	
//	public void  delete(Integer itemid );
	
}
