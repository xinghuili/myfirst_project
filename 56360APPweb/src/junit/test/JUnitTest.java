package junit.test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import javax.annotation.Resource;

import org.apache.commons.collections.map.HashedMap;
import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kuheng.dao.KuDriverMapper;
import com.kuheng.dao.KuLocationMapper;
import com.kuheng.entity.member.KuAdmin;
import com.kuheng.entity.member.KuDriver;
import com.kuheng.entity.member.KuLocation;
import com.kuheng.entity.member.KuMember;
import com.kuheng.service.system.KuAdminService;
import com.kuheng.service.system.KuDriverService;
import com.kuheng.service.system.KuMemberService;
import com.kuheng.service.system.impl.KuAdminLoginlogServiceImpl;
import com.kuheng.service.system.impl.KuAdminServiceImpl;
import com.kuheng.service.system.impl.KuDriverServiceImpl;
import com.kuheng.utils.Systemprint;

public class JUnitTest {
	@Autowired
	private KuAdminService kuAdminService;
	@Autowired
	private KuMemberService kuMemberService;
	@Resource
	private KuLocationMapper kuLocationMapper;
	@Autowired
	private KuDriverService kuDriverService;

	@Before
	public void setUp() throws Exception {
	}

	// @Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	// @Test
	public void testSave() {
		// KuAdmin ka = new KuAdmin();
		// ka.setAddtime(123456);
		// ka.setContent("");
		// ka.setEditor("");
		// ka.setEdittime(0);
		// ka.setIp("");
		// ka.setLogintime(0);
		// ka.setPassword("123");
		// ka.setPwdsafe((short)5);
		// ka.setTruename("aa");
		// ka.setUsername("tt");
		// ka.setUserid(2);
		// kuAdminService.save(ka);
		System.out.println("11111111111111");
		// fail("Not yet implemented");
	}

	// @Test
	public void testSelectByPrimaryKey() {
		// int id=1;
		System.out.println("222222222");
		// KuAdmin ka = kuAdminService.selectByPrimaryKey(1);
		// System.out.println("name====="+ka.getAdminname());
		// fail("Not yet implemented");
	}

	// @Test
	public void deletepic() {
		String str = "/upload/2017/6/11/c373c570-aaf0-4787-ae3d-0c95c67a5c85.jpg";
		String path = this.getClass().getResource("").getPath();
		System.out.println(path);
		path = path.substring(1, path.indexOf("WEB-INF/classes"));
		System.out.println(path);
		File file = new File(path + str);
		System.out.println("131321313");
		Systemprint.prints("userid", "title", "content", "userid2", "orderid");
		// if(file.isFile()){
		// file.delete();
		System.out.println("ok");
		// }
	}

	
	//@Test
	public void ff3() {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				System.out.println("task");
			}
		}, 0, 1000);
	}
	@Test
	public void fff() throws JSONException{
		String str="[{\"id\":56,\"total\":0},{\"id\":56,\"total\":1},{\"id\":56,\"total\":2}]";	
		org.json.JSONArray json=new org.json.JSONArray(str);
		
		for(int i=0;i<json.length();i++){
			org.json.JSONObject jsonObj = json.getJSONObject(i);
			
			System.out.println(jsonObj.get("total").toString());
		}
//		for(int i=0;i<json.size();i++){
//			System.out.println("1231323");
//		}
	}
	
	@Test
	public void sss(){
		System.out.println("-----"+(int)(System.currentTimeMillis()/1000));
	}
}