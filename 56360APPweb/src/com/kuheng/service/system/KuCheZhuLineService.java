package com.kuheng.service.system;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuCheZhuLine;

public interface KuCheZhuLineService {
	int addLine(KuCheZhuLine record);
	List<Map<String,Object>> selectline(Integer userid);
	int deleteLine(Integer id);
}
