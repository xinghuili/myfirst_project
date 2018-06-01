package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuSiteCategory;

public interface KuSiteCategoryService {

	public void  save(KuSiteCategory bean );
	
	public List<KuSiteCategory> selectPaging(Map param); 
	
	public List<KuSiteCategory> selectByParentid(Integer parentid); 
	
	public int selectCount(Map param); 
	
	public KuSiteCategory selectByPrimaryKey(Integer itemid);

	public void  update(KuSiteCategory bean) ;
	
	public void  delete(Integer itemid );
	
}
