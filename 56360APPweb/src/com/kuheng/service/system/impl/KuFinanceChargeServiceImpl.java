package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuFinanceChargeMapper;
import com.kuheng.entity.member.KuFinanceCharge;
import com.kuheng.service.system.KuFinanceChargeService;

@Service("kuFinanceChargeService")
public class KuFinanceChargeServiceImpl implements KuFinanceChargeService {

	@Resource
	private KuFinanceChargeMapper kuFinanceChargeMapper;
	
	@Override
	public void delete(Long itemid) {
		// TODO Auto-generated method stub
		 kuFinanceChargeMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	public void save(KuFinanceCharge bean) {
		// TODO Auto-generated method stub
		 kuFinanceChargeMapper.insert(bean);
	}

	

	@Override
	public KuFinanceCharge selectByPrimaryKey(Long itemid) {
		// TODO Auto-generated method stub
		return kuFinanceChargeMapper.selectByPrimaryKey(itemid);
	}



	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return kuFinanceChargeMapper.selectCount(param);
	}

	@Override
	public List<KuFinanceCharge> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuFinanceChargeMapper.selectPaging(param);
	}

	@Override
	public void update(KuFinanceCharge bean) {
		// TODO Auto-generated method stub
		kuFinanceChargeMapper.updateByPrimaryKey(bean);
	}

}
