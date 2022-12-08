package com.saieesh;

import java.util.Scanner;

public class ArraysOne {
    public static void main(String[] args) {

        int[] ScoreArray = new int[5];

        Scanner in = new Scanner(System.in);


        for(int i=0;i<ScoreArray.length;i++){
            int a= in.nextInt();
            ScoreArray[i]=a;
        }
        System.out.println(ScoreArray[4]);

    }
}
