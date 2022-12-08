package com.saieesh;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        float tempFarhenhit;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the celsius");
        float tempCelsius = input.nextFloat();
        tempFarhenhit = (tempCelsius * 9/5) + 32;
        System.out.println("Temparature in Farhenhite :" + tempFarhenhit);

    }
}

