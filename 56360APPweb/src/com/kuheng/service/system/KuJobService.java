package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuJob;

public interface KuJobService {

	public int  save(KuJob bean );
	
	public List<KuJob> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public KuJob selectByPrimaryKey(Integer itemid);

	public int update(KuJob bean) ;
	
	public int  delete(Integer itemid );
	
	public KuJob selectByUserId(Integer userId);
	
	public int saveOrUpdate(KuJob bean);
	
	public List<Map<String, Object>> selectAll(); 
	
	public List<Map<String, Object>> selectBySearch(Map param); 
	
}
