package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuCollection;

public interface KuCollectionService {
	
	public int insert(KuCollection record);
	
    public List<Map<String,Object>> selectByCollectorId(long collectorId);
    
    public int deleteByPrimaryKey(Integer itemid);
}
