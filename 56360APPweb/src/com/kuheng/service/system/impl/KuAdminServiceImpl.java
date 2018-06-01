package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuAdminMapper;
import com.kuheng.entity.member.KuAdmin;
import com.kuheng.service.system.KuAdminService;
@Service("kuAdminService")
public class KuAdminServiceImpl implements KuAdminService {

	@Resource
	private KuAdminMapper kuAdminMapper;
	
	@Override
	public void delete(Integer itemid) {
		// TODO Auto-generated method stub
		 kuAdminMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	public void save(KuAdmin bean) {
		// TODO Auto-generated method stub
		 kuAdminMapper.insert(bean);
	}

	

	@Override
	public KuAdmin selectByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		System.out.println("dsdddddd=="+itemid);
		return kuAdminMapper.selectByPrimaryKey(itemid);
	}



	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return kuAdminMapper.selectCount(param);
	}

	@Override
	public List<KuAdmin> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuAdminMapper.selectPaging(param);
	}

	@Override
	public void update(KuAdmin bean) {
		// TODO Auto-generated method stub
		kuAdminMapper.updateByPrimaryKey(bean);
	}

	@Override
	public KuAdmin selectByName(String adminName) {
		// TODO Auto-generated method stub
		return kuAdminMapper.selectByName(adminName);
	}


	
	
	
	
}
