package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuGadminMapper;
import com.kuheng.entity.member.KuGadmin;
import com.kuheng.service.system.KuGadminService;


@Service("kuGadminService")
public class KuGadminServiceImpl implements KuGadminService {

	@Resource
	private KuGadminMapper kuGadminMapper;
	
	@Override
	public void delete(Integer itemid) {
		// TODO Auto-generated method stub
		 kuGadminMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	public void save(KuGadmin bean) {
		// TODO Auto-generated method stub
		 kuGadminMapper.insert(bean);
	}

	

	@Override
	public KuGadmin selectByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		return kuGadminMapper.selectByPrimaryKey(itemid);
	}



	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return kuGadminMapper.selectCount(param);
	}

	@Override
	public List<KuGadmin> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuGadminMapper.selectPaging(param);
	}

	@Override
	public void update(KuGadmin bean) {
		// TODO Auto-generated method stub
		kuGadminMapper.updateByPrimaryKey(bean);
	}

	


}
