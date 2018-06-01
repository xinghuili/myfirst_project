package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kuheng.dao.EUserMapper;
import com.kuheng.dao.KuFriendMapper;
import com.kuheng.entity.member.KuFriend;
import com.kuheng.service.system.KuFriendService;

@Service("kuFriendService")
public class KuFriendServiceImpl implements KuFriendService {
	
	@Resource
	private KuFriendMapper kuFriendMapper;
	
	@Override
	public int insert(KuFriend record) {
		// TODO Auto-generated method stub
		return kuFriendMapper.insert(record);
	}

	@Override
	public List<KuFriend> selectByUserId(long userId) {
		// TODO Auto-generated method stub
		return kuFriendMapper.selectByUserId(userId);
	}

	@Override
	public List<Map<String,Object>> selectByUserId2(long userId) {
		// TODO Auto-generated method stub
		return kuFriendMapper.selectByUserId2(userId);
	}

	@Override
	public int deleteByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		return kuFriendMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	public int updateByPrimaryKeySelective(KuFriend record) {
		// TODO Auto-generated method stub
		return kuFriendMapper.updateByPrimaryKeySelective(record);
	}

}
