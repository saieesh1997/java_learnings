package com.saieesh.oops;
interface  Animal1{
    void walk();
}

interface Herbivore{

}

class Horse implements Animal1,Herbivore{
    @Override
    public void walk() {
        System.out.println("Walks on 4legs");
    }
}

public class Interfaces {
    public static void main(String[] args) {

    }
}
