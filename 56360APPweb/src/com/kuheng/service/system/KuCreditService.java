package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuCredit;


public interface KuCreditService {
	
	public List<KuCredit> selectPaging(Map param); 

	
}
