package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.EInfo;


public interface EInfoService {
public void  save(EInfo bean );
	
	public List<EInfo> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public EInfo selectByPrimaryKey(Integer itemid);

	public void  update(EInfo bean) ;
	
	public void  delete(Integer itemid );
	public int selectCountByStartAndEnd(Map param);
	public int selectCount();
	public List<Map<String,Object>> selectInfoByStartAndEnd(Map param);
	public int updateState(Map param);
}
