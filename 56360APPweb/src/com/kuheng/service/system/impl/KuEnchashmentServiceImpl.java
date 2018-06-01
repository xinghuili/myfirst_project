package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;
import java.math.BigDecimal;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kuheng.dao.KuEnchashmentMapper;
import com.kuheng.dao.KuFinanceRecordMapper;
import com.kuheng.dao.KuMemberMapper;
import com.kuheng.entity.member.KuEnchashment;
import com.kuheng.entity.member.KuFinanceRecord;
import com.kuheng.entity.member.KuMember;
import com.kuheng.entity.member.KuSender;
import com.kuheng.service.system.KuEnchashmentService;


@Service("kuEnchashmentService")
public class KuEnchashmentServiceImpl implements KuEnchashmentService {

	@Resource
	private KuEnchashmentMapper kuEnchashmentMapper;
	@Resource
	private KuFinanceRecordMapper kuFinanceRecordMapper;
	
	@Override
	public void delete(Long itemid) {
		// TODO Auto-generated method stub
		 kuEnchashmentMapper.deleteByPrimaryKey(itemid);
	}
	
	
	@Override
	public int save(KuEnchashment bean) {
		return kuEnchashmentMapper.insertSelective(bean);
	}

	

	@Override
	public KuEnchashment selectByPrimaryKey(Long itemid) {
		// TODO Auto-generated method stub
		return kuEnchashmentMapper.selectByPrimaryKey(itemid);
	}



	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return kuEnchashmentMapper.selectCount(param);
	}

	@Override
	public List<KuEnchashment> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuEnchashmentMapper.selectPaging(param);
	}

	@Override
	public void update(KuEnchashment bean) {
		// TODO Auto-generated method stub
		kuEnchashmentMapper.updateByPrimaryKey(bean);
	}

	


}
