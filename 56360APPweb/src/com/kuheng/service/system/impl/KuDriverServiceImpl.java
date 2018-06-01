package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kuheng.dao.KuDriverMapper;
import com.kuheng.dao.KuMemberMapper;
import com.kuheng.entity.member.KuDriver;
import com.kuheng.entity.member.KuMember;
import com.kuheng.service.system.KuDriverService;


@Service("kuDriverService")
public class KuDriverServiceImpl implements KuDriverService {

	@Resource
	private KuDriverMapper kuDriverMapper;
	@Autowired
	private KuMemberMapper kuMemberMapper;
	
	@Override
	public void delete(Integer itemid) {
		// TODO Auto-generated method stub
		 kuDriverMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	public void save(KuDriver bean) {
		// TODO Auto-generated method stub
		 kuDriverMapper.insert(bean);
	}

	

	@Override
	public KuDriver selectByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		return kuDriverMapper.selectByPrimaryKey(itemid);
	}



	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return kuDriverMapper.selectCount(param);
	}

	@Override
	public List<KuDriver> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuDriverMapper.selectPaging(param);
	}

	@Override
	public int update(KuDriver bean) {
		// TODO Auto-generated method stub
		return kuDriverMapper.updateByPrimaryKeySelective(bean);
	}

	@Override
	@Transactional
	public int saveOrUpudate(KuDriver driver, KuMember member,Integer flag) {
		// TODO Auto-generated method stub
		int i=0,j=0;
		if(flag==1){
			i=kuDriverMapper.updateByPrimaryKeySelective(driver);
		}else{
			i=kuDriverMapper.insertSelective(driver);
		}
			j=kuMemberMapper.updateByPrimaryKeySelective(member);
		
		return i+j;	
	}

	@Override
	public List<Map<String, String>> selectAllCarno() {
		// TODO Auto-generated method stub
		return kuDriverMapper.selectAllCarno();
	}



}
