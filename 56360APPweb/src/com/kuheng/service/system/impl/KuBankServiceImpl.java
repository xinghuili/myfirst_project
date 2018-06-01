package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kuheng.dao.KuBankMapper;
import com.kuheng.dao.KuCreditMapper;
import com.kuheng.entity.member.KuBank;
import com.kuheng.entity.member.KuCredit;
import com.kuheng.service.system.KuBankService;


@Service("kuBankService")
public class KuBankServiceImpl implements KuBankService {

	@Resource
	private KuBankMapper kuBankMapper;
	@Resource
	private KuCreditMapper kuCreditMapper;
	
	@Override
	public int delete(Integer itemid) {
		// TODO Auto-generated method stub
		 return kuBankMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	@Transactional
	public int save(KuBank bean) {
		// TODO Auto-generated method stub
		KuCredit credit=new KuCredit();
		credit.setUserid(bean.getUserid());
		credit.setValue(5);
		credit.setReason("绑定银行卡");
		credit.setAddtime((int)(System.currentTimeMillis()/1000));
		kuCreditMapper.insert(credit);
		return kuBankMapper.insert(bean);
	}

	

	@Override
	public KuBank selectByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		return kuBankMapper.selectByPrimaryKey(itemid);
	}



	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return kuBankMapper.selectCount(param);
	}

	@Override
	public List<KuBank> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuBankMapper.selectPaging(param);
	}

	@Override
	public int update(KuBank bean) {
		// TODO Auto-generated method stub
		return kuBankMapper.updateByPrimaryKeySelective(bean);
	}

	@Override
	public List<KuBank> selectByUserId(Map param) {
		// TODO Auto-generated method stub
		return kuBankMapper.selectByUserId(param);
	}

	


}
