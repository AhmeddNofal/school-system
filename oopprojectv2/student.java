/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopprojectv2;

/**
 *
 * @author Owner
 */
public class student extends person {

    int sId;
    String sAddress, major;
    courseGrades[] courseGrades;

    public student() {
        this.name = "";
        this.age = 0;
        this.sId = 0;
        this.sAddress = "";
        this.major = "";
    }

    public student(String name, int age, int sId, String sAddress, String major, courseGrades[] courseGrades) {
        super(name,age);
        this.courseGrades = courseGrades;
        this.sId = sId;
        this.sAddress = sAddress;
        this.major = major;
    }

    public courseGrades[] getCourseGrades() {
        return courseGrades;
    }

    public void setCourseGrades(courseGrades[] courseGrades) {
        this.courseGrades = courseGrades;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getsId() {
        return sId;
    }

    public String getsAddress() {
        return sAddress;
    }

    public String getMajor() {
        return major;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    

}
