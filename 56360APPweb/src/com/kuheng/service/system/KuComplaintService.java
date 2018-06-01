package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuComplaint;

public interface KuComplaintService {

	public int  save(KuComplaint bean );
	
	public List<KuComplaint> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public KuComplaint selectByPrimaryKey(Integer itemid);

	public void  update(KuComplaint bean) ;
	
	public void  delete(Integer itemid );
	public int selectBy2Id(Map param);
}
