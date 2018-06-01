package com.kuheng.dao;

import java.util.List;
import java.util.Map;

import com.kuheng.entity.member.KuCredit;

public interface KuCreditMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_credit
     *
     * @mbg.generated Mon Dec 11 10:54:47 CST 2017
     */
    int deleteByPrimaryKey(Integer itemid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_credit
     *
     * @mbg.generated Mon Dec 11 10:54:47 CST 2017
     */
    int insert(KuCredit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_credit
     *
     * @mbg.generated Mon Dec 11 10:54:47 CST 2017
     */
    int insertSelective(KuCredit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_credit
     *
     * @mbg.generated Mon Dec 11 10:54:47 CST 2017
     */
    KuCredit selectByPrimaryKey(Integer itemid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_credit
     *
     * @mbg.generated Mon Dec 11 10:54:47 CST 2017
     */
    int updateByPrimaryKeySelective(KuCredit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku_credit
     *
     * @mbg.generated Mon Dec 11 10:54:47 CST 2017
     */
    int updateByPrimaryKey(KuCredit record);
    /**
	 * 按条件查询记录
	 * 
	 * @param param
	 *            查询条件参数，包括WHERE条件、分页条件、排序条件
	 * @return 符合条件记录的实体对象的List
	 */

	public List<KuCredit> selectPaging(Map param); 
}