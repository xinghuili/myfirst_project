package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuMainlineMapper;
import com.kuheng.entity.member.KuMainline;
import com.kuheng.service.system.KuMainlineService;


@Service("kuMainlineService")
public class KuMainlineServiceImpl implements KuMainlineService {

	@Resource
	private KuMainlineMapper kuMainlineMapper;
	
	@Override
	public int delete(Integer itemid) {
		// TODO Auto-generated method stub
		 return kuMainlineMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	public int save(KuMainline bean) {
		// TODO Auto-generated method stub
		 return kuMainlineMapper.insert(bean);
	}

	

	@Override
	public KuMainline selectByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		return kuMainlineMapper.selectByPrimaryKey(itemid);
	}



	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return kuMainlineMapper.selectCount(param);
	}

	@Override
	public List<KuMainline> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuMainlineMapper.selectPaging(param);
	}

	@Override
	public void update(KuMainline bean) {
		// TODO Auto-generated method stub
		kuMainlineMapper.updateByPrimaryKey(bean);
	}

	@Override
	public List<Map<String,Object>> selectByUserId(Integer userid) {
		return kuMainlineMapper.selectByUserId(userid);
	}

	@Override
	public int selectCountByUserId(Integer userid) {
		// TODO Auto-generated method stub
		return kuMainlineMapper.selectCountByUserId(userid);
	}

	@Override
	public List<Map<String, Object>> selectByUserId1(Integer userid) {
		// TODO Auto-generated method stub
		return kuMainlineMapper.selectByUserId1(userid);
	}

	@Override
	public void updateLasttime(KuMainline bean) {
		kuMainlineMapper.updateByPrimaryKeySelective(bean);
		
	}

}
