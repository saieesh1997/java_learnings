package com.saieesh;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<String> list1 = new ArrayList<>();

//        add elements

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements
        System.out.println(list.get(0));
        System.out.println(list.get(2));

        //add element in between

        list.add(2,1);

        System.out.println(list);

        //set element

        list.set(0,5);

        System.out.println(list);

        //Delete Element

        list.remove(3);
        System.out.println(list);

        //Array list size

        System.out.println(list.size());

        //Loops
        System.out.println("printing arraylist using loops");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //sorting function
        Collections.sort(list);
        System.out.println(list);

    }
}
