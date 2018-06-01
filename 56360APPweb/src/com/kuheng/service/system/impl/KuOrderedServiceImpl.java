package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;






import com.kuheng.dao.KuOrderedMapper;
import com.kuheng.entity.member.KuOrdered;
import com.kuheng.service.system.KuOrderedService;
@Service("KuOrderedService")
public class KuOrderedServiceImpl implements KuOrderedService {
	
	@Resource
	private KuOrderedMapper kuOrderedMapper;
	
	@Override
	public List<Map<String, Object>> selectMyOrderByState(Map param) {
		// TODO Auto-generated method stub
		return kuOrderedMapper.selectMyOrderByState(param);
	}

	@Override
	public Map<String, Object> selectWayBillById(Integer itemId) {
		// TODO Auto-generated method stub
		return kuOrderedMapper.selectWayBillById(itemId);
	}

	@Override
	public int update(KuOrdered record) {
		// TODO Auto-generated method stub
		return kuOrderedMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int save(KuOrdered bean) {
		// TODO Auto-generated method stub
		return kuOrderedMapper.insert(bean);
	}

	@Override
	public List<KuOrdered> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public KuOrdered selectByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer itemid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<KuOrdered> selectPagingByTime(Map param) {
		// TODO Auto-generated method stub
		return kuOrderedMapper.selectPagingByTime(param);
	}

	@Override
	public int selectCountByOidAndUid(Map param) {
		// TODO Auto-generated method stub
		return kuOrderedMapper.selectCountByOidAndUid(param);
	}

	@Override
	public int updateStateByOidAndUid(Map param) {
		// TODO Auto-generated method stub
		return kuOrderedMapper.updateStateByOidAndUid(param);
	}

}
