package com.saieesh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int empID = in.nextInt();

        String department = in.next();

        switch (empID){
            case 1:
                System.out.println("saieesh");
                break;

            case 2:
                System.out.println("rahul");
                switch(department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Ac":
                        System.out.println("Account department");
                        break;

                    default:
                        System.out.println("Invalid department");
                }
                break;

            default:
                System.out.println("Invalid Emp Id");
        }
    }
}
