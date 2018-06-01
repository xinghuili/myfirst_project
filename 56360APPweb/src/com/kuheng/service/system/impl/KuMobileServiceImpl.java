package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kuheng.dao.KuMobileMapper;
import com.kuheng.entity.member.KuMobile;
import com.kuheng.service.system.KuMobileService;
@Service("kuMobileServiceImpl")
public class KuMobileServiceImpl implements KuMobileService {
	@Autowired
	private KuMobileMapper kuMobileMapper;

	@Override
	public int save(KuMobile bean) {
		// TODO Auto-generated method stub
		return kuMobileMapper.insert(bean);
	}

	@Override
	public List<KuMobile> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public KuMobile selectByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(KuMobile bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer itemid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Map<String, Object>> selectByUserId(Long userId) {
		// TODO Auto-generated method stub
		return kuMobileMapper.selectByUserId(userId);
	}

	@Override
	public List<KuMobile> selectByUserId2(Long userId2) {
		// TODO Auto-generated method stub
		return kuMobileMapper.selectByUserId2(userId2);
	}
	

}
