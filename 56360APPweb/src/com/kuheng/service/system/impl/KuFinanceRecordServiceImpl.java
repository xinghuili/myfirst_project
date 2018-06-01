package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuFinanceRecordMapper;
import com.kuheng.entity.member.KuFinanceRecord;
import com.kuheng.service.system.KuFinanceRecordService;
@Service("kuFinanceRecordService")
public class KuFinanceRecordServiceImpl implements KuFinanceRecordService {

	@Resource
	private KuFinanceRecordMapper kuFinanceRecordMapper;
	
	@Override
	public void delete(Integer itemid) {
		// TODO Auto-generated method stub
		 kuFinanceRecordMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	public void save(KuFinanceRecord bean) {
		// TODO Auto-generated method stub
		 kuFinanceRecordMapper.insert(bean);
	}

	

	@Override
	public KuFinanceRecord selectByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		return kuFinanceRecordMapper.selectByPrimaryKey(itemid);
	}



	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return kuFinanceRecordMapper.selectCount(param);
	}

	@Override
	public List<KuFinanceRecord> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuFinanceRecordMapper.selectPaging(param);
	}

	@Override
	public void update(KuFinanceRecord bean) {
		// TODO Auto-generated method stub
		kuFinanceRecordMapper.updateByPrimaryKey(bean);
	}

	@Override
	public List<KuFinanceRecord> selectByUserId(Integer UserId) {
		// TODO Auto-generated method stub
		return kuFinanceRecordMapper.selectByUserId(UserId);
	}

}
