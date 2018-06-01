package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuDriver;
import com.kuheng.entity.member.KuMember;

public interface KuDriverService {

	public void  save(KuDriver bean );
	
	public List<KuDriver> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public KuDriver selectByPrimaryKey(Integer itemid);

	public int  update(KuDriver bean) ;
	
	public void  delete(Integer itemid );

	public int  saveOrUpudate(KuDriver driver, KuMember member,Integer flag);
	
	public List<Map<String,String>> selectAllCarno();
}
