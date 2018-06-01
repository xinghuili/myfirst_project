package com.kuheng.dao;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuAdminWorklog;

public interface KuAdminWorklogMapper {
	 /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_admin_worklog
     *
     * @mbggenerated Sun May 21 11:09:53 CST 2017
     */
    int deleteByPrimaryKey(Integer itemid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_admin_worklog
     *
     * @mbggenerated Sun May 21 11:09:53 CST 2017
     */
    int insert(KuAdminWorklog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_admin_worklog
     *
     * @mbggenerated Sun May 21 11:09:53 CST 2017
     */
    int insertSelective(KuAdminWorklog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_admin_worklog
     *
     * @mbggenerated Sun May 21 11:09:53 CST 2017
     */
    KuAdminWorklog selectByPrimaryKey(Integer itemid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_admin_worklog
     *
     * @mbggenerated Sun May 21 11:09:53 CST 2017
     */
    int updateByPrimaryKeySelective(KuAdminWorklog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_admin_worklog
     *
     * @mbggenerated Sun May 21 11:09:53 CST 2017
     */
    int updateByPrimaryKey(KuAdminWorklog record);
    
    
    
    
    
    /**
	 * 按条件查询记录
	 * 
	 * @param param
	 *            查询条件参数，包括WHERE条件、分页条件、排序条件
	 * @return 符合条件记录的实体对象的List
	 */

	public List<KuAdminWorklog> selectPaging(Map param); 
	
	
	
	/**
	 * 按条件查询记录总的记录
	 * 
	 * @param param
	 *    查询条件参数，包括WHERE条件、
	 */

	public int selectCount(Map param); 
}