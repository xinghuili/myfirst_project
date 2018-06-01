package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuCity;

public interface KuCityService {

	public void  save(KuCity bean );
	
	public List<KuCity> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public KuCity selectByPrimaryKey(Integer itemid);

	public void  update(KuCity bean) ;
	
	public void  delete(Integer itemid );
	
	public int selectByMobileAddress(String province,String city);

	public List<Map<String,Object>> selectProvinceAndCity(Map param);
	public List<Map<String,Object>> selectProvinceAndCity1(Map param);
	public List<Map<String,Object>> selectProvinceAndCity2(Map param);
	public List<Map<String,Object>> selectProvinceAndCity3(Map param);
	public List<Map<String,Object>> selectRegisterCity(Integer userid);

}
