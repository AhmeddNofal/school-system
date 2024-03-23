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
public class courseGrades extends course {

    int courseWork, exam;

    public courseGrades(String name, int code) {
        super(name, code);
        this.courseWork = 0;
        this.exam = 0;
    }

    public courseGrades(String name, int code, int courseWork, int exam) {
        super(name, code);
        this.courseWork = courseWork;
        this.exam = exam;

    }

    public int getCourseWork() {
        return courseWork;
    }

    public void setCourseWork(int courseWork) {
        this.courseWork = courseWork;
    }

    public int getExam() {
        return exam;
    }

    public void setExam(int exam) {
        this.exam = exam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
