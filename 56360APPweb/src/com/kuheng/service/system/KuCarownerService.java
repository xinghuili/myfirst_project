package com.kuheng.service.system;

import com.kuheng.entity.member.KuCarowner;

public interface KuCarownerService {

	public KuCarowner selectByPrimaryKey(Long userid);
	
	public KuCarowner selectByCarNo(String carNo);
}
