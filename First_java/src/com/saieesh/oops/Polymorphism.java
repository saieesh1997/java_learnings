package com.saieesh.oops;
class Student1{
    String Name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Student1 std1 = new Student1();
        std1.printInfo(25);

        std1.printInfo("vipul",25);
    }
}
