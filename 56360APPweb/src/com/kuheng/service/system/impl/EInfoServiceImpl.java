package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.EInfoMapper;
import com.kuheng.entity.member.EInfo;
import com.kuheng.service.system.EInfoService;

@Service("/eInfoService")
public class EInfoServiceImpl implements EInfoService {
	@Resource
	private EInfoMapper eInfoMapper;
	@Override
	public void save(EInfo bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EInfo> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EInfo selectByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		return eInfoMapper.selectByPrimaryKey(itemid);
	}

	@Override
	public void update(EInfo bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer itemid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int selectCountByStartAndEnd(Map param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> selectInfoByStartAndEnd(Map param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateState(Map param) {
		// TODO Auto-generated method stub
		return 0;
	}

}
