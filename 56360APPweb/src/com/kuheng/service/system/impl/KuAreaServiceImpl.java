package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuAreaMapper;
import com.kuheng.entity.member.KuArea;
import com.kuheng.service.system.KuAreaService;
@Service("kuAreaService")
public class KuAreaServiceImpl implements KuAreaService {

	@Resource
	private KuAreaMapper kuAreaMapper;
	
	@Override
	public void delete(Integer itemid) {
		// TODO Auto-generated method stub
		 kuAreaMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	public void save(KuArea bean) {
		// TODO Auto-generated method stub
		 kuAreaMapper.insert(bean);
	}

	

	@Override
	public KuArea selectByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		return kuAreaMapper.selectByPrimaryKey(itemid);
	}



	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return kuAreaMapper.selectCount(param);
	}

	@Override
	public List<KuArea> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuAreaMapper.selectPaging(param);
	}

	@Override
	public void update(KuArea bean) {
		// TODO Auto-generated method stub
		kuAreaMapper.updateByPrimaryKey(bean);
	}

	


}
