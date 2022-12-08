package com.saieesh.oops;
class Shape{    //Base Class
    String color;
}
class triangle extends Shape{  //Child class

}
public class Inheritance {
    public static void main(String[] args) {
        triangle t1 = new triangle();
        t1.color="red";
    }
}
