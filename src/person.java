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
public class person {

    int age;
    String name;

    public person() {
        this.age = 0;
        this.name = "";
    }

    public person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

       public void setAge(int age, int add) {
        this.age = age + add;
    }

    public void setName(String name) {
        this.name = name;
    }
}
