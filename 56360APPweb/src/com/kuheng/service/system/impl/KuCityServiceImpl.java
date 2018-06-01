package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kuheng.dao.KuCityMapper;
import com.kuheng.entity.member.KuCity;
import com.kuheng.service.system.KuCityService;


@Service("kuCityService")
public class KuCityServiceImpl implements KuCityService {

	@Resource
	private KuCityMapper kuCityMapper;
	
	@Override
	public void delete(Integer itemid) {
		// TODO Auto-generated method stub
		 kuCityMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	public void save(KuCity bean) {
		// TODO Auto-generated method stub
		 kuCityMapper.insert(bean);
	}

	

	@Override
	public KuCity selectByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		return kuCityMapper.selectByPrimaryKey(itemid);
	}



	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return kuCityMapper.selectCount(param);
	}

	@Override
	public List<KuCity> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuCityMapper.selectPaging(param);
	}

	@Override
	public void update(KuCity bean) {
		// TODO Auto-generated method stub
		kuCityMapper.updateByPrimaryKey(bean);
	}

	@Override
	public List<Map<String, Object>> selectProvinceAndCity(Map param) {
		// TODO Auto-generated method stub
		return kuCityMapper.selectProvinceAndCity(param);
	}

	@Override
	public List<Map<String, Object>> selectProvinceAndCity1(Map param) {
		// TODO Auto-generated method stub
		return kuCityMapper.selectProvinceAndCity1(param);
	}

	@Override
	public List<Map<String, Object>> selectProvinceAndCity2(Map param) {
		// TODO Auto-generated method stub
		return kuCityMapper.selectProvinceAndCity2(param);
	}

	@Override
	public List<Map<String, Object>> selectProvinceAndCity3(Map param) {
		// TODO Auto-generated method stub
		return kuCityMapper.selectProvinceAndCity3(param);
	}

	@Override
	public List<Map<String, Object>> selectRegisterCity(Integer userid) {
		// TODO Auto-generated method stub
		return kuCityMapper.selectRegisterCity(userid);
	}

	@Override
	public int selectByMobileAddress(String province, String city) {
		// TODO Auto-generated method stub
		return kuCityMapper.selectByMobileAddress(province,city);
	}


	


}
