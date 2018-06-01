package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuCollectionMapper;
import com.kuheng.entity.member.KuCollection;
import com.kuheng.service.system.KuCollectionService;

@Service("KuCollectionService")
public class KuCollectionServiceImpl implements KuCollectionService {
	
	@Resource
	private KuCollectionMapper kuCollectionMapper;

	@Override
	public int insert(KuCollection record) {
		// TODO Auto-generated method stub
		return kuCollectionMapper.insert(record);
	}

	@Override
	public List<Map<String,Object>> selectByCollectorId(long collectorId) {
		// TODO Auto-generated method stub
		return kuCollectionMapper.selectByCollectorId(collectorId);
	}

	@Override
	public int deleteByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		return kuCollectionMapper.deleteByPrimaryKey(itemid);
	}

}
