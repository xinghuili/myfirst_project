package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuOrdered;

public interface KuOrderedService {
	public int  save(KuOrdered bean );
	
	public List<KuOrdered> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public KuOrdered selectByPrimaryKey(Integer itemid);

	public void  delete(Integer itemid );
	
	public List<Map<String,Object>> selectMyOrderByState(Map param);
	
	public Map<String,Object> selectWayBillById(Integer itemId);
	
	public int update(KuOrdered record);
	
	public List<KuOrdered> selectPagingByTime(Map param); 
	
	public int selectCountByOidAndUid(Map param);
	
	public int updateStateByOidAndUid(Map param);

}
