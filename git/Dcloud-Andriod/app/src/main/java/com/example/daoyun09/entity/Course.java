package com.example.daoyun09.entity;

public class Course {

private static final long serialVersionUID=1L;

    private Long id;

    /**
     * 班课名
     */
    private String name;

    /**
     * 班课号
     */
    private String code;

    /**
     * 班级
     */
    private String className;

    /**
     * 学期
     */
    private String semester;

    /**
     * 班课封面
     */
    private String image;

    /**
     * 学习要求
     */
    private String learnRequire;

    /**
     * 教学进度
     */
    private String teachProgress;

    /**
     * 考试安排
     */
    private String examSchedule;

    /**
     * 学校和院系（外键，连接school表）
     */
    private String schoolCode;

    /**
     * 是否学校课表班课
     */
    private Integer flag;

    /**
     * 班课创建者
     */
    private String studentId;

    /**
     * 活动
     */
    private String activityId;

    /**
     * 消息
     */
    private String messageId;

    /**
     * 是否可以加入班课，默认可以，0可以，1不可以
     */
    private Integer isJoin;

    /**
     * 0表示未删除，1表示删除
     */
    private Integer isDelete;

    private Long teacherId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLearnRequire() {
        return learnRequire;
    }

    public void setLearnRequire(String learnRequire) {
        this.learnRequire = learnRequire;
    }

    public String getTeachProgress() {
        return teachProgress;
    }

    public void setTeachProgress(String teachProgress) {
        this.teachProgress = teachProgress;
    }

    public String getExamSchedule() {
        return examSchedule;
    }

    public void setExamSchedule(String examSchedule) {
        this.examSchedule = examSchedule;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Integer getIsJoin() {
        return isJoin;
    }

    public void setIsJoin(Integer isJoin) {
        this.isJoin = isJoin;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Course{" +
        "id=" + id +
        ", name=" + name +
        ", code=" + code +
        ", className=" + className +
        ", semester=" + semester +
        ", image=" + image +
        ", learnRequire=" + learnRequire +
        ", teachProgress=" + teachProgress +
        ", examSchedule=" + examSchedule +
        ", schoolCode=" + schoolCode +
        ", flag=" + flag +
        ", studentId=" + studentId +
        ", activityId=" + activityId +
        ", messageId=" + messageId +
        ", isJoin=" + isJoin +
        ", isDelete=" + isDelete +
        ", teacherId=" + teacherId +
        "}";
    }
}