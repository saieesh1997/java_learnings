package com.saieesh.oops;
//99.9 -int,float,double
//Integer, Float , Double , Character  for every primitive dtatype we have class
public class Wrapperclass {

    public static void main(String[] args) {

        int i=5;

//          Integer ii = new Integer(i); //Boxing
            Integer jj = i; //Auto Boxing

            int j = jj.intValue();  //unboxing
            int k =jj;              //Autounboxing


    }
}
