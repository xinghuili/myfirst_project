package com.kuheng.service.system;

import com.kuheng.entity.member.KuSender;

public interface KuSenderService {
	
	public KuSender selectByPrimaryKey(Long userid);
	
	public int insert(KuSender record);
}
