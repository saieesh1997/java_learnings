package com.saieesh;

public class ArrayExercise {
    public static void main(String[] args) {
        //declare int array

        int[] exerciseArray = {3,4,2,7,8,9,5};

        //print all the elements
        for(int i =0;i < exerciseArray.length;i++){
            System.out.println("Element is: "+exerciseArray[i]);
        }

        //Find the largest number
        int largest = exerciseArray[0];
        for(int j =1 ;j < exerciseArray.length;j++){
            if ( exerciseArray[j] > largest){
                largest = exerciseArray[j];
            }
        }
        System.out.println("largest number is : "+largest);

        //Sum up all the elements
        int sum =0;
        for(int i =0;i < exerciseArray.length;i++){
            sum += exerciseArray[i];
        }

        System.out.println("Total sum of all array element: "+sum);

    }
}
