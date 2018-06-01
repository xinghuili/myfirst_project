package com.kuheng.service.system;

import com.kuheng.entity.member.KuLocation;

public interface KuLocationService {
	
	public int delete(Integer itemid);

	public int save(KuLocation record);

	public int insertSelective(KuLocation record);

	public KuLocation selectByPrimaryKey(Integer itemid);

	public int updateByPrimaryKeySelective(KuLocation record);
    
	public int update(KuLocation record);

}
