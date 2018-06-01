package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuAdminLoginlogMapper;
import com.kuheng.entity.member.KuAdminLoginlog;
import com.kuheng.service.system.KuAdminLoginlogService;
@Service("kuAdminLoginlogService")
public class KuAdminLoginlogServiceImpl implements KuAdminLoginlogService {

	@Resource
	private KuAdminLoginlogMapper kuAdminLoginlogMapper;
	
	@Override
	public void delete(Integer itemid) {
		// TODO Auto-generated method stub
		 kuAdminLoginlogMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	public void save(KuAdminLoginlog bean) {
		// TODO Auto-generated method stub
		 kuAdminLoginlogMapper.insert(bean);
	}

	

	@Override
	public KuAdminLoginlog selectByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		return kuAdminLoginlogMapper.selectByPrimaryKey(itemid);
	}



	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return kuAdminLoginlogMapper.selectCount(param);
	}

	@Override
	public List<KuAdminLoginlog> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuAdminLoginlogMapper.selectPaging(param);
	}

	@Override
	public void update(KuAdminLoginlog bean) {
		// TODO Auto-generated method stub
		kuAdminLoginlogMapper.updateByPrimaryKey(bean);
	}

	

}
