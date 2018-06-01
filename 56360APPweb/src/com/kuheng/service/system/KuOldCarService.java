package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuOldCar;

public interface KuOldCarService {

	public int  saveAndUpdate(KuOldCar bean );
	
	public List<KuOldCar> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public KuOldCar selectByPrimaryKey(Integer itemid);

	public int  update(KuOldCar bean) ;
	
	public void  delete(Integer itemid );
	
	public Map<String, Object> openCarDetail(Integer itemid); 
	
	public List<Map<String, Object>> selectBySearch(Map<String, Object> map); 
	
	public List<Map<String, Object>> selectCarByUserId(Integer userId); 
}
