package com.saieesh.oops;
class pen{
    String color; //Data
    String type; //ballpoint or Gell pen

    public void Write(){     // members , methods and functions
        System.out.println("Writing Something");
    }

    public void Color(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printName(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(){
        System.out.println("Constructor Called");
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
}
public class ClassesObjects {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color="Red";
        pen1.type="gel";

        pen1.Write();
        pen1.Color();

        pen pen2 = new pen();
        pen2.color="Green";
        pen2.Color();
        System.out.println("Non-Parameterized Constructor");
        Student s1= new Student();
        s1.name="saieesh";
        s1.age=22;
        s1.printName();
        System.out.println("Parameterized Constructor");
        Student s2= new Student("Sai",25);
        s2.printName();
        System.out.println("Copy Constructor");
        Student s3 = new Student(s2);
        s3.printName();

    }

}
