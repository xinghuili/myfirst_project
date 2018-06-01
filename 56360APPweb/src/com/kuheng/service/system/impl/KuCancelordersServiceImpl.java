package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuCancelordersMapper;
import com.kuheng.entity.member.KuCancelorders;
import com.kuheng.service.system.KuCancelordersService;



@Service("kuCancelordersService")
public class KuCancelordersServiceImpl implements KuCancelordersService {

	@Resource
	private KuCancelordersMapper kuCancelordersMapper;
	
	@Override
	public void delete(Long itemid) {
		// TODO Auto-generated method stub
		kuCancelordersMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	public void save(KuCancelorders bean) {
		// TODO Auto-generated method stub
		kuCancelordersMapper.insert(bean);
	}

	

	@Override
	public KuCancelorders selectByPrimaryKey(Long itemid) {
		// TODO Auto-generated method stub
		return kuCancelordersMapper.selectByPrimaryKey(itemid);
	}



	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return kuCancelordersMapper.selectCount(param);
	}

	@Override
	public List<KuCancelorders> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuCancelordersMapper.selectPaging(param);
	}

	@Override
	public void update(KuCancelorders bean) {
		// TODO Auto-generated method stub
		kuCancelordersMapper.updateByPrimaryKey(bean);
	}

	


}
