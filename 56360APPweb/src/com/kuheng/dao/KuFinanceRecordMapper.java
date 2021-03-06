package com.kuheng.dao;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuFinanceCharge;
import com.kuheng.entity.member.KuFinanceRecord;

public interface KuFinanceRecordMapper {
	 /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_finance_record
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    int deleteByPrimaryKey(Integer itemid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_finance_record
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    int insert(KuFinanceRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_finance_record
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    int insertSelective(KuFinanceRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_finance_record
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    KuFinanceRecord selectByPrimaryKey(Integer itemid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_finance_record
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    int updateByPrimaryKeySelective(KuFinanceRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_finance_record
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    int updateByPrimaryKey(KuFinanceRecord record);
    
    
    
    
    /**
	 * 按条件查询记录
	 * 
	 * @param param
	 *            查询条件参数，包括WHERE条件、分页条件、排序条件
	 * @return 符合条件记录的实体对象的List
	 */

	public List<KuFinanceRecord> selectPaging(Map param); 
	
	
	
	/**
	 * 按条件查询记录总的记录
	 * 
	 * @param param
	 *    查询条件参数，包括WHERE条件、
	 */

	public int selectCount(Map param); 
	
	/**
	 * 按条件查询记录
	 * 
	 * @param param
	 *            查询条件参数,会员ID
	 * @return 符合条件记录的实体对象的List
	 */

	public List<KuFinanceRecord> selectByUserId(Integer UserId);
}