package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuAdminWorklogMapper;
import com.kuheng.entity.member.KuAdminWorklog;
import com.kuheng.service.system.KuAdminWorklogService;
@Service("kuAdminWorklogService")
public class KuAdminWorklogServiceImpl implements KuAdminWorklogService {

	@Resource
	private KuAdminWorklogMapper kuAdminWorklogMapper;
	
	@Override
	public void delete(Integer itemid) {
		// TODO Auto-generated method stub
		 kuAdminWorklogMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	public void save(KuAdminWorklog bean) {
		// TODO Auto-generated method stub
		 kuAdminWorklogMapper.insert(bean);
	}

	

	@Override
	public KuAdminWorklog selectByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		return kuAdminWorklogMapper.selectByPrimaryKey(itemid);
	}



	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return kuAdminWorklogMapper.selectCount(param);
	}

	@Override
	public List<KuAdminWorklog> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuAdminWorklogMapper.selectPaging(param);
	}

	@Override
	public void update(KuAdminWorklog bean) {
		// TODO Auto-generated method stub
		kuAdminWorklogMapper.updateByPrimaryKey(bean);
	}

	

}
