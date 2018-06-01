package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuDriver;
import com.kuheng.entity.member.KuMember;

public interface KuMemberService {

	public int  save(KuMember bean );
	
	public List<KuMember> selectPaging(Map param); 
	
	public int selectCount(Map param); 
	
	public KuMember selectByPrimaryKey(Integer itemid);

	public int  update(KuMember bean) ;
	
	public void  delete(Integer itemid );
	
	public KuMember selectBymobile(String mobile);
	public int updatePasswordByMobile(Map param);
}
