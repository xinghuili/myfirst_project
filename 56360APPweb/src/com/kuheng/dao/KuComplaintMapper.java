package com.kuheng.dao;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuComplaint;

public interface KuComplaintMapper {
	 /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_complaint
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    int deleteByPrimaryKey(Integer itemid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_complaint
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    int insert(KuComplaint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_complaint
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    int insertSelective(KuComplaint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_complaint
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    KuComplaint selectByPrimaryKey(Integer itemid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_complaint
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    int updateByPrimaryKeySelective(KuComplaint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_complaint
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(KuComplaint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_complaint
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    int updateByPrimaryKey(KuComplaint record);
    
    
    
    
    
    
    /**
	 * 按条件查询记录
	 * 
	 * @param param
	 *            查询条件参数，包括WHERE条件、分页条件、排序条件
	 * @return 符合条件记录的实体对象的List
	 */

	public List<KuComplaint> selectPaging(Map param); 
	
	
	
	/**
	 * 按条件查询记录总的记录
	 * 
	 * @param param
	 *    查询条件参数，包括WHERE条件、
	 */

	public int selectCount(Map param); 
	
	
	/**
	 * 在投诉之前查询是否已经投诉过一次
	 * 
	 * @param param
	 * @return
	 * 
	 */
	public int selectBy2Id(Map param);
}