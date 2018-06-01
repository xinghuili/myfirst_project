package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuCreditMapper;
import com.kuheng.entity.member.KuCredit;
import com.kuheng.service.system.KuCreditService;
@Service("kuCreditService")
public class KuCreditServiceImpl implements KuCreditService {

	@Resource
	private KuCreditMapper kuCreditMapper;

	@Override
	public List<KuCredit> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuCreditMapper.selectPaging(param);
	}
	


}
