package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuBank;
import com.kuheng.entity.member.KuMobile;

public interface KuMobileService {
   
	public int  save(KuMobile bean );
	
	public List<KuMobile> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public KuMobile selectByPrimaryKey(Integer itemid);

	public void  update(KuMobile bean) ;
	
	public void  delete(Integer itemid );

	public List<Map<String,Object>> selectByUserId(Long userId); 
	
	public List<KuMobile> selectByUserId2(Long userId2);
}
