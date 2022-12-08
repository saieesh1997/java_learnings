package com.saieesh;

import java.util.ArrayList;

public class ArrayListSample {
    public static void main(String[] args) {
//        String[] stringArray =new String[10];
//        stringArray[0]="karwar";
//        System.out.println(stringArray[0]);

        //Array list

        ArrayList<String> heroes = new ArrayList<String>();

        heroes.add("Hulk");
        heroes.add("Iron Man");
        heroes.add("Batman");

        System.out.println("My superhero is : "+heroes.get(0));

        heroes.add(0,"ChotaBheem");

        System.out.println("My superhero is : "+heroes.get(0));
        System.out.println("My superhero is : "+heroes.get(1));
    }
}
