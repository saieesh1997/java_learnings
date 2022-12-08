package com.saieesh;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num =input.nextFloat();
        System.out.println(num);

//        Type casting
        int num1 = (int)(67.56f);
        System.out.println(num1);

//        automatic type promotion in expression

//        int a =257;
//        byte b =(byte) (a); // 257 % 256 =1
//        System.out.println(b);
//
//        byte a1 =40;
//        byte b1 =50;
//        byte c1 =100;
//
//        int sum =a1*b1/c1;
//
//        System.out.println(sum);
//
//        int asci ='A';
//        System.out.println(asci);

 // Example
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f= 5.67f;
        double d = 0.1234;
        double result =(f*b)+(i/c)-(d-s);
        System.out.println((f*b)+" "+(i/c)+" "+(d-s));
        //float + int - double = double
        System.out.println(result);
    }
}


