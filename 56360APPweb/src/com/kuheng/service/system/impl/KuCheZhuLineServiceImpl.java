package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuCheZhuLineMapper;
import com.kuheng.entity.member.KuCheZhuLine;
import com.kuheng.service.system.KuCheZhuLineService;
@Service("/kuCheZhuLineService")
public class KuCheZhuLineServiceImpl implements KuCheZhuLineService {
	@Resource
	private KuCheZhuLineMapper kuCheZhuLineMapper;
	@Override
	public int addLine(KuCheZhuLine record) {
		return kuCheZhuLineMapper.insertSelective(record);
	}
	@Override
	public List<Map<String,Object>> selectline(Integer userid) {
		
		return kuCheZhuLineMapper.selectline(userid);
	}
	@Override
	public int deleteLine(Integer id) {
		
		return kuCheZhuLineMapper.deleteByPrimaryKey(id);
	}

}
