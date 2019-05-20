package com.ehr.pojo;

public class EhrTest {
    private Integer id;

    private String name;

    private String department;

    private String post;

    private Integer salary;

    private String recruitmentway;

    private String testresult;

    private String telphone;

    private String email;

    private Float writtenscore;

    private Float interviewscore;

    private String marks;

    private String filepath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getRecruitmentway() {
        return recruitmentway;
    }

    public void setRecruitmentway(String recruitmentway) {
        this.recruitmentway = recruitmentway == null ? null : recruitmentway.trim();
    }

    public String getTestresult() {
        return testresult;
    }

    public void setTestresult(String testresult) {
        this.testresult = testresult == null ? null : testresult.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Float getWrittenscore() {
        return writtenscore;
    }

    public void setWrittenscore(Float writtenscore) {
        this.writtenscore = writtenscore;
    }

    public Float getInterviewscore() {
        return interviewscore;
    }

    public void setInterviewscore(Float interviewscore) {
        this.interviewscore = interviewscore;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks == null ? null : marks.trim();
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }
}