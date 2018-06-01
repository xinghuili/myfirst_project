package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuJobMapper;
import com.kuheng.entity.member.KuJob;
import com.kuheng.service.system.KuJobService;


@Service("kuJobService")
public class KuJobServiceImpl implements KuJobService {

	@Resource
	private KuJobMapper kuJobMapper;
	
	@Override
	public int delete(Integer itemid) {
		// TODO Auto-generated method stub
		 return kuJobMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	public int save(KuJob bean) {
		// TODO Auto-generated method stub
		 return kuJobMapper.insert(bean);
	}

	

	@Override
	public KuJob selectByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		return kuJobMapper.selectByPrimaryKey(itemid);
	}



	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return kuJobMapper.selectCount(param);
	}

	@Override
	public List<KuJob> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuJobMapper.selectPaging(param);
	}

	@Override
	public int update(KuJob bean) {
		// TODO Auto-generated method stub
		return kuJobMapper.updateByPrimaryKeySelective(bean);
	}

	@Override
	public KuJob selectByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return kuJobMapper.selectByUserId(userId);
	}

	@Override
	public int saveOrUpdate(KuJob bean) {
		if(bean.getItemid()!=0){
			return kuJobMapper.updateByPrimaryKey(bean);
		}else{
			return kuJobMapper.insert(bean);
		}
		
	}

	@Override
	public List<Map<String, Object>> selectAll() {
		return kuJobMapper.selectAll();
	}

	@Override
	public List<Map<String, Object>> selectBySearch(Map param) {
		// TODO Auto-generated method stub
		return kuJobMapper.selectBySearch(param);
	}

}
