package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuMainline;

public interface KuMainlineService {

	public int  save(KuMainline bean );
	
	public List<KuMainline> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public KuMainline selectByPrimaryKey(Integer itemid);
	
	public List<Map<String,Object>> selectByUserId(Integer userid);
	
	public List<Map<String,Object>> selectByUserId1(Integer userid);

	public void  update(KuMainline bean) ;
	public void  updateLasttime(KuMainline bean) ;
	public int  delete(Integer itemid );
	
	public int selectCountByUserId(Integer userid);
	
}
