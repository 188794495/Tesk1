package com.pojo;

import java.sql.Timestamp;

/**
 * @author Administrator
 * 实体类
 */
public class Student {
    /**
     * 构造实体类的所有数据类型
     */
    private Long id;
    private Timestamp createAt;
    private Timestamp updateAt;
    private String name;
    private int qq;
    private String job;
    private Long startTime;
    private String college;
    private int number;
    private String dailyUrl;
    private String wish;
    private String brother;
    private String referee;
    private String city;
    private String review;

    /**
     * 使用ALT+Ins快捷键导入get、set方法
     * get就是得到值的意思
     * set就是设置值
     * 其实就是取值和赋值
     *
     * @return
     */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQq() {
        return qq;
    }

    public void setQq(int qq) {
        this.qq = qq;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDailyUrl() {
        return dailyUrl;
    }

    public void setDailyUrl(String dailyUrl) {
        this.dailyUrl = dailyUrl;
    }

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    public String getBrother() {
        return brother;
    }

    public void setBrother(String brother) {
        this.brother = brother;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    /**
     * 使用ALT+Ins快捷键导入toString方法
     * toString是Object里边的方法
     * 返回值为字符串
     * Object是Java中所有类的父类，位于Java.long包中
     *
     * @return
     */

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", name='" + name + '\'' +
                ", qq=" + qq +
                ", job='" + job + '\'' +
                ", startTime=" + startTime +
                ", college='" + college + '\'' +
                ", number=" + number +
                ", dailyUrl='" + dailyUrl + '\'' +
                ", wish='" + wish + '\'' +
                ", brother='" + brother + '\'' +
                ", referee='" + referee + '\'' +
                ", city='" + city + '\'' +
                ", review='" + review + '\'' +
                '}';
    }
}

