package com.kuheng.service.system.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuReceiptMapper;
import com.kuheng.entity.member.KuReceipt;
import com.kuheng.service.system.KuReceiptService;

@Service("/kuReceiptService")
public class KuReceiptServiceImpl implements KuReceiptService {
	
	@Resource
	private KuReceiptMapper kuReceiptMapper;

	@Override
	public int insert(KuReceipt record) {
		return kuReceiptMapper.insertSelective(record);
	}
	
	
}
