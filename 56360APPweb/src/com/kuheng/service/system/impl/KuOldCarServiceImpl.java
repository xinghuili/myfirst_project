package com.kuheng.service.system.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kuheng.dao.KuOldCarMapper;
import com.kuheng.entity.member.KuOldCar;
import com.kuheng.service.system.KuOldCarService;


@Service("kuOldCarService")
public class KuOldCarServiceImpl implements KuOldCarService {

	@Resource
	private KuOldCarMapper kuOldCarMapper;
	
	@Override
	public void delete(Integer itemid) {
		// TODO Auto-generated method stub
		 kuOldCarMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	public int saveAndUpdate(KuOldCar car) {
		System.out.println("111");
		// TODO Auto-generated method stub
		 if(car.getItemid()!=null){
			 System.out.println("222");
			 return kuOldCarMapper.updateByPrimaryKey(car);
		 }else{
			 System.out.println("33");
			 return kuOldCarMapper.insert(car);
		 }
		 
	}

	

	@Override
	public KuOldCar selectByPrimaryKey(Integer itemid) {
		// TODO Auto-generated method stub
		return kuOldCarMapper.selectByPrimaryKey(itemid);
	}



	@Override
	public int selectCount(Map param) {
		// TODO Auto-generated method stub
		return kuOldCarMapper.selectCount(param);
	}

	@Override
	public List<KuOldCar> selectPaging(Map param) {
		// TODO Auto-generated method stub
		return kuOldCarMapper.selectPaging(param);
	}

	@Override
	public int update(KuOldCar bean) {
		// TODO Auto-generated method stub
		return kuOldCarMapper.updateByPrimaryKeySelective(bean);
	}

//	@Override
//	public List<Map<String, Object>> selectByMobileAddress(String province, String city) {
//		// TODO Auto-generated method stub
//		return kuOldCarMapper.selectByMobileAddress(province,city);
//	}

//	@Override
//	public List<Map<String, Object>> selectByCityId(Integer cityId) {
//		// TODO Auto-generated method stub
//		return kuOldCarMapper.selectByCityId(cityId);
//	}
	
	@Transactional
	@Override
	public Map<String, Object> openCarDetail(Integer itemid) {
		// TODO Auto-generated method stub
		Map<String, Object> map = kuOldCarMapper.selectById(itemid);
		KuOldCar car=new KuOldCar();
		car.setItemid(Integer.parseInt(map.get("itemid").toString()));
		car.setHits(Integer.parseInt(map.get("hits").toString())+1);
		kuOldCarMapper.updateByPrimaryKeySelective(car);
		return map;
	}

	@Override
	public List<Map<String, Object>> selectBySearch(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return kuOldCarMapper.selectBySearch(map);
	}

	@Override
	public List<Map<String, Object>> selectCarByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return kuOldCarMapper.selectCarByUserId(userId);
	}

}
