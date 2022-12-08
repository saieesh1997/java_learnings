package com.saieesh.oops;
abstract class Animal{
    Animal(){
        System.out.println("hey animal");
    }
    public void walk(){

    }
}

class horse extends Animal{
    horse(){
        System.out.println("this is horse");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk() {
        System.out.println("Walks on two legs");
    }
}
public class Abstraction {
    public static void main(String[] args) {
         horse horse = new horse();
         horse.walk();
//         Animal animal = new Animal(); // Will Make an runtime error that is very risky.
//         animal.walk();
    }
}
