package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuBank;

public interface KuBankService {

	public int  save(KuBank bean );
	
	public List<KuBank> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public KuBank selectByPrimaryKey(Integer itemid);

	public int update(KuBank bean) ;
	
	public int  delete(Integer itemid );
	
	public List<KuBank> selectByUserId(Map param); 
	
}
