package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuMemberMapper;
import com.kuheng.entity.member.KuMember;
import com.kuheng.service.system.KuMemberService;
@Service("kuMemberService")
public class KuMemberServiceImpl implements KuMemberService {

	@Resource
	private KuMemberMapper kuMemberMapper;
	
	@Override
	public void delete(Integer itemid) {
		// TODO Auto-generated method stub
		 kuMemberMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	public int save(KuMember bean) {
		// TODO Auto-generated method stub
		 return kuMemberMapper.insert(bean);
	}

	

	@Override
	public KuMember selectByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		return kuMemberMapper.selectByPrimaryKey(itemid);
	}



	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return kuMemberMapper.selectCount(param);
	}

	@Override
	public List<KuMember> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuMemberMapper.selectPaging(param);
	}

	@Override
	public int update(KuMember bean) {
		// TODO Auto-generated method stub
		return kuMemberMapper.updateByPrimaryKeySelective(bean);
	}

	@Override
	public KuMember selectBymobile(String mobile) {
		// TODO Auto-generated method stub
		return kuMemberMapper.selectBymobile(mobile);
	}

	@Override
	public int updatePasswordByMobile(Map param) {
		// TODO Auto-generated method stub
		return kuMemberMapper.updatePasswordByMobile(param);
	}

}
