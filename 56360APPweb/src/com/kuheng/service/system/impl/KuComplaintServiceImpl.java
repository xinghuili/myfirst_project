package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuComplaintMapper;
import com.kuheng.entity.member.KuComplaint;
import com.kuheng.service.system.KuComplaintService;


@Service("kuComplaintService")
public class KuComplaintServiceImpl implements KuComplaintService {

	@Resource
	private KuComplaintMapper kuComplaintMapper;
	
	@Override
	public void delete(Integer itemid) {
		// TODO Auto-generated method stub
		 kuComplaintMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	public int save(KuComplaint bean) {
		// TODO Auto-generated method stub
		 return kuComplaintMapper.insert(bean);
	}

	

	@Override
	public KuComplaint selectByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		return kuComplaintMapper.selectByPrimaryKey(itemid);
	}



	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return kuComplaintMapper.selectCount(param);
	}

	@Override
	public List<KuComplaint> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuComplaintMapper.selectPaging(param);
	}

	@Override
	public void update(KuComplaint bean) {
		// TODO Auto-generated method stub
		kuComplaintMapper.updateByPrimaryKey(bean);
	}

	@Override
	public int selectBy2Id(Map param) {
		// TODO Auto-generated method stub
		return kuComplaintMapper.selectBy2Id(param);
	}

	


}
