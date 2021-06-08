package com.example.daoyun09.entity;

public class Attendence {

private static final long serialVersionUID=1L;

    private Integer id;

    /**
     * 老师开始签到的时间，存长整型
     */
    private String startTime;

    /**
     * 老师发起签到位置
     */
    private String local;

    /**
     * 0表示未删除，1表示删除
     */
    private Integer isDelete;

    /**
     * 课程号
     */
    private String code;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Attendence{" +
        "id=" + id +
        ", startTime=" + startTime +
        ", local=" + local +
        ", isDelete=" + isDelete +
        ", code=" + code +
        "}";
    }
}