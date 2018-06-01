package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuFinanceRecord;

public interface KuFinanceRecordService {

	public void  save(KuFinanceRecord bean );
	
	public List<KuFinanceRecord> selectPaging(Map param);
	
	public List<KuFinanceRecord> selectByUserId(Integer UserId);
	
	public int selectCount(Map param); 
	
	public KuFinanceRecord selectByPrimaryKey(Integer itemid);

	public void  update(KuFinanceRecord bean) ;
	
	public void  delete(Integer itemid );
	
}
