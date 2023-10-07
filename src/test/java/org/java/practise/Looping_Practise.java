package org.java.practise;

import java.util.*;

public class Looping_Practise {
    public static void main(String[] args) {
//        int counter=10;
//        for(int i=0;i<=10;i++) {
//            System.out.println("hii Tara "+i);
//            counter++;
//        }


        List<String> userName = new ArrayList<String>();
        userName.add("Tara");
        userName.add("rutuu");
        userName.add("Radhu");

//        for(String name:userName){
//            System.out.println(name);
//        }

//        for (int i = 0; i < userName.size(); i++) {
//            System.out.println(userName.get(i));
//        }

        int i =0;
        while (i<userName.size()){
            System.out.println(userName.get(i));
            i++;
        }
    }
}
