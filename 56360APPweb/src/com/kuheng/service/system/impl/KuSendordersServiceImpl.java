package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuSendordersMapper;
import com.kuheng.entity.member.KuSendorders;
import com.kuheng.service.system.KuSendordersService;


@Service("kuSendordersService")
public class KuSendordersServiceImpl implements KuSendordersService {

	@Resource
	private KuSendordersMapper kuSendordersMapper;
	
	@Override
	public void delete(Long itemid) {
		// TODO Auto-generated method stub
		 kuSendordersMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	public void save(KuSendorders bean) {
		// TODO Auto-generated method stub
		 kuSendordersMapper.insert(bean);
	}

	

	@Override
	public KuSendorders selectByPrimaryKey(Long itemid) {
		// TODO Auto-generated method stub
		return kuSendordersMapper.selectByPrimaryKey(itemid);
	}



	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return kuSendordersMapper.selectCount(param);
	}

	@Override
	public List<KuSendorders> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuSendordersMapper.selectPaging(param);
	}

	@Override
	public void update(KuSendorders bean) {
		// TODO Auto-generated method stub
		kuSendordersMapper.updateByPrimaryKey(bean);
	}

}
