package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuFinanceCharge;

public interface KuFinanceChargeService {

	public void  save(KuFinanceCharge bean );
	
	public List<KuFinanceCharge> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public KuFinanceCharge selectByPrimaryKey(Long itemid);

	public void  update(KuFinanceCharge bean) ;
	
	public void  delete(Long itemid );
	
}
