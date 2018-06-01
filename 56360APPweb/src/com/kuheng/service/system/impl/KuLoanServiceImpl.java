package com.kuheng.service.system.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuLoanMapper;
import com.kuheng.entity.member.KuLoan;
import com.kuheng.service.system.KuLoanService;

@Service("kuLoanService")
public class KuLoanServiceImpl implements KuLoanService {

	@Resource
	private KuLoanMapper kuLoanMapper;
	@Override
	public int insert(KuLoan record) {
		return kuLoanMapper.insert(record);
	}

}
