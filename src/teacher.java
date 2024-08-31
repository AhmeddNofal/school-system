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
    String address, course;
    

    public teacher() {
        this.name = "";
        this.age = 0;
        this.phNo = 0;
        this.tId = 0;
        this.address = "";
        this.course = "";
       
    }

    public teacher(String name, int age, int phNo, int tId, String address,String course) {
        super(name,age);
        this.phNo = phNo;
        this.tId = tId;
        this.address = address;
        this.course = course;
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
        return "teacher{" + "phNo=" + phNo + ", tId=" + tId + ", address=" + address + ", course=" + course + '}';
    }
}
