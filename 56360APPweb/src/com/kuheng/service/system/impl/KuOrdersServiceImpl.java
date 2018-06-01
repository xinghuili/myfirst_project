package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuOrdersMapper;
import com.kuheng.entity.member.KuOrders;
import com.kuheng.service.system.KuOrdersService;


@Service("kuOrdersService")
public class KuOrdersServiceImpl implements KuOrdersService {

	@Resource
	private KuOrdersMapper kuOrdersMapper;
	
	@Override
	public void delete(long itemid) {
		// TODO Auto-generated method stub
		 kuOrdersMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	public void save(KuOrders bean) {
		// TODO Auto-generated method stub
		 kuOrdersMapper.insert(bean);
	}

	

	@Override
	public KuOrders selectByPrimaryKey(long itemid) {
		// TODO Auto-generated method stub
		return kuOrdersMapper.selectByPrimaryKey(itemid);
	}



	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return kuOrdersMapper.selectCount(param);
	}

	@Override
	public List<KuOrders> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuOrdersMapper.selectPaging(param);
	}

	@Override
	public void update(KuOrders bean) {
		// TODO Auto-generated method stub
		kuOrdersMapper.updateByPrimaryKey(bean);
	}

}
