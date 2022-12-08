package com.saieesh;
class Student{
    String name;
    static String school;

    public static void changeSchool(){
        school="newschool";
    }
}
public class Static {
    public static void main(String[] args) {
        Student.school="Stjosheps";
        Student std1 = new Student();
        std1.name="Saieesh Naik";
        System.out.println(std1.name+" "+std1.school);
    }
}
