package com.saieesh;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);

//        Q: print number 1 to 5

        for(int num = 1;num <= 5;num++){
            System.out.println(num);
        }

        // print 1 to n
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int num = 1; num <= n; num++) {
            System.out.println(num);
        }


        //while loops

        int num2 =1;
        while(num2<=5){
            System.out.println(num2);
            num2+= 1;
        }
        System.out.println("Do While Loop");
        int a =1;
        do{
            System.out.println(a);
            a++;
        }while(a<=5);
    }
}
