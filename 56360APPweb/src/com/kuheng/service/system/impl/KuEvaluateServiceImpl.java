package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kuheng.dao.KuEvaluateMapper;
import com.kuheng.dao.KuOrderedMapper;
import com.kuheng.entity.member.KuEvaluate;
import com.kuheng.entity.member.KuOrdered;
import com.kuheng.service.system.KuEvaluateService;


@Service("kuEvaluateService")
public class KuEvaluateServiceImpl implements KuEvaluateService {

	@Resource
	private KuEvaluateMapper kuEvaluateMapper;
	@Resource
	private KuOrderedMapper kuOrderedMapper;
	
	@Override
	public void delete(Integer itemid) {
		// TODO Auto-generated method stub
		 kuEvaluateMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	@Transactional
	public int save(KuEvaluate bean) {
		// TODO Auto-generated method stub
		 kuEvaluateMapper.insert(bean);
		 KuOrdered order=new KuOrdered();
		 order.setEvaluation(1);
		 order.setOrdersid(bean.getOrderid());
		 return kuOrderedMapper.updateByOrderId(order);
	}

	

	@Override
	public KuEvaluate selectByPrimaryKey(Long orderId) {
		// TODO Auto-generated method stub
		return kuEvaluateMapper.selectByPrimaryKey(orderId);
	}



	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return kuEvaluateMapper.selectCount(param);
	}

	@Override
	public List<KuEvaluate> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuEvaluateMapper.selectPaging(param);
	}

	@Override
	public void update(KuEvaluate bean) {
		// TODO Auto-generated method stub
		kuEvaluateMapper.updateByPrimaryKey(bean);
	}

	


}
