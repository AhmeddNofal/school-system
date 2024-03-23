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
public class teacher extends person {
    int phNo,tId;
    String address;
    course[] courses;

    public teacher() {
        this.name = "";
        this.age = 0;
        this.phNo = 0;
        this.tId = 0;
        this.address = "";
       
    }

    public teacher(String name, int age, int phNo, int tId, String address, course[] courses) {
        super(name,age);
        this.phNo = phNo;
        this.tId = tId;
        this.address = address;
        this.courses = courses;
    }

  

    public course[] getCourses() {
        return courses;
    }

    public void setCourses(course[] courses) {
        this.courses = courses;
    }


    public int getPhNo() {
        return phNo;
    }



    public int gettId() {
        return tId;
    }

    public String getAddress() {
        return address;
    }

    public void setPhNo(int phNo) {
        this.phNo = phNo;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return "teacher{" + "phNo=" + phNo + ", tId=" + tId + ", address=" + address + ", courses=" + courses + '}';
    }
}
