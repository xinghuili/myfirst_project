package com.kuheng.entity.member;

public class KuPeiSongLine {
    private Integer id;

    private Integer userid;

    private String startProvince;

    private String startCity;

    private String startTown;

    private String stopProvince;

    private String stopCity;

    private String stopTown;

    private String passCity;

    private Integer addtime;

    private String filed1;

    private String filed2;

    private String filed3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getStartProvince() {
        return startProvince;
    }

    public void setStartProvince(String startProvince) {
        this.startProvince = startProvince == null ? null : startProvince.trim();
    }

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity == null ? null : startCity.trim();
    }

    public String getStartTown() {
        return startTown;
    }

    public void setStartTown(String startTown) {
        this.startTown = startTown == null ? null : startTown.trim();
    }

    public String getStopProvince() {
        return stopProvince;
    }

    public void setStopProvince(String stopProvince) {
        this.stopProvince = stopProvince == null ? null : stopProvince.trim();
    }

    public String getStopCity() {
        return stopCity;
    }

    public void setStopCity(String stopCity) {
        this.stopCity = stopCity == null ? null : stopCity.trim();
    }

    public String getStopTown() {
        return stopTown;
    }

    public void setStopTown(String stopTown) {
        this.stopTown = stopTown == null ? null : stopTown.trim();
    }

    public String getPassCity() {
        return passCity;
    }

    public void setPassCity(String passCity) {
        this.passCity = passCity == null ? null : passCity.trim();
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public String getFiled1() {
        return filed1;
    }

    public void setFiled1(String filed1) {
        this.filed1 = filed1 == null ? null : filed1.trim();
    }

    public String getFiled2() {
        return filed2;
    }

    public void setFiled2(String filed2) {
        this.filed2 = filed2 == null ? null : filed2.trim();
    }

    public String getFiled3() {
        return filed3;
    }

    public void setFiled3(String filed3) {
        this.filed3 = filed3 == null ? null : filed3.trim();
    }
}