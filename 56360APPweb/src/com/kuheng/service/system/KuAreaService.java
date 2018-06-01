package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuArea;

public interface KuAreaService {

	public void  save(KuArea bean );
	
	public List<KuArea> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public KuArea selectByPrimaryKey(Integer itemid);

	public void  update(KuArea bean) ;
	
	public void  delete(Integer itemid );
	
}
