package com.kuheng.entity.member;

import java.io.Serializable;

public class KuGadmin implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_gadmin.gid
     *
     * @mbggenerated Mon May 22 08:41:46 CST 2017
     */
    private Integer gid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_gadmin.gname
     *
     * @mbggenerated Mon May 22 08:41:46 CST 2017
     */
    private String gname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_gadmin.limits
     *
     * @mbggenerated Mon May 22 08:41:46 CST 2017
     */
    private String limits;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_gadmin.gid
     *
     * @return the value of ku_gadmin.gid
     *
     * @mbggenerated Mon May 22 08:41:46 CST 2017
     */
    public Integer getGid() {
        return gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_gadmin.gid
     *
     * @param gid the value for ku_gadmin.gid
     *
     * @mbggenerated Mon May 22 08:41:46 CST 2017
     */
    public void setGid(Integer gid) {
        this.gid = gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_gadmin.gname
     *
     * @return the value of ku_gadmin.gname
     *
     * @mbggenerated Mon May 22 08:41:46 CST 2017
     */
    public String getGname() {
        return gname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_gadmin.gname
     *
     * @param gname the value for ku_gadmin.gname
     *
     * @mbggenerated Mon May 22 08:41:46 CST 2017
     */
    public void setGname(String gname) {
        this.gname = gname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_gadmin.limits
     *
     * @return the value of ku_gadmin.limits
     *
     * @mbggenerated Mon May 22 08:41:46 CST 2017
     */
    public String getLimits() {
        return limits;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_gadmin.limits
     *
     * @param limits the value for ku_gadmin.limits
     *
     * @mbggenerated Mon May 22 08:41:46 CST 2017
     */
    public void setLimits(String limits) {
        this.limits = limits;
    }
}