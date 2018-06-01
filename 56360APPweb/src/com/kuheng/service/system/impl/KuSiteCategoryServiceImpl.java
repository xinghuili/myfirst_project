package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuSiteCategoryMapper;
import com.kuheng.entity.member.KuSiteCategory;
import com.kuheng.service.system.KuSiteCategoryService;


@Service("kuSiteCategoryService")
public class KuSiteCategoryServiceImpl implements KuSiteCategoryService {

	@Resource
	private KuSiteCategoryMapper kuSiteCategoryMapper;
	
	@Override
	public void delete(Integer itemid) {
		// TODO Auto-generated method stub
		 kuSiteCategoryMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	public void save(KuSiteCategory bean) {
		// TODO Auto-generated method stub
		 kuSiteCategoryMapper.insert(bean);
	}

	

	@Override
	public KuSiteCategory selectByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		return kuSiteCategoryMapper.selectByPrimaryKey(itemid);
	}



	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return kuSiteCategoryMapper.selectCount(param);
	}

	@Override
	public List<KuSiteCategory> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuSiteCategoryMapper.selectPaging(param);
	}

	@Override
	public void update(KuSiteCategory bean) {
		// TODO Auto-generated method stub
		kuSiteCategoryMapper.updateByPrimaryKey(bean);
	}

	@Override
	public List<KuSiteCategory> selectByParentid(Integer parentid) {
		// TODO Auto-generated method stub
		return kuSiteCategoryMapper.selectByParentid(parentid);
	}

}
