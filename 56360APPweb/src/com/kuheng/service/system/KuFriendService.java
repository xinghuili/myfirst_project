package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuFriend;

public interface KuFriendService {
	
	public int insert(KuFriend record);
	
	public List<KuFriend> selectByUserId(long userId);
	
	public List<Map<String,Object>> selectByUserId2(long userId);
	
	public int deleteByPrimaryKey(Integer itemid);
	
	public int updateByPrimaryKeySelective(KuFriend record);
}
