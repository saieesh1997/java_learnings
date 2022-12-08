package com.saieesh;

public class Methods {

//    modifier return-type method-name(parameter list){
        //body
//    }
    public static void main(String[] args) {
        System.out.println("hello");
        sayHello();
        System.out.println(minNumber(4,5));
    }

    public static void sayHello(){
        System.out.println("Hello Java");
        System.out.println("How are You?");
    }

    // create a fun of min number

    public static int minNumber(int num1 ,int num2){
        int min;
        if(num1>num2){
            min=num2;
        }else{
            min = num1;
        }
        return min;
    }
}
