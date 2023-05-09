package com.haohao.entity;

public class TeachInfo {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private String department;
    //必须提供无参方法
    //提供get，set 方法
    public Integer getId() {
        return id;
    }

    public TeachInfo() {
    }

    public TeachInfo(Integer id, String name, String sex, Integer age, String department) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.department = department;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "TeachInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
