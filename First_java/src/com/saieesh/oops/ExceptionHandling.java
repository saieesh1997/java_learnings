package com.saieesh.oops;

public class ExceptionHandling {
    public static void main(String[] args) {

//        try{
//            int myInt = Integer.parseInt("pants");
//        }catch(Exception nfe){
//            System.out.println("Hey dude , you cant make int of that");
//        }

        try{
            int myInt = Integer.parseInt("pants");
        }catch(Exception nfe){
            System.out.println("Hey dude , you cant make int of that");
        }
        finally {
            System.out.println("in the finally block");
            System.out.println("Finally block is always executed at any cost");
        }

    }
}
