package org.java.practise.collection_concepts;

import java.util.ArrayList;
import java.util.List;

public class Collections1ArrayList {
    public static void main(String[] args) {
        //declaration
        ArrayList al=new ArrayList();
        ArrayList<Integer> al1=new ArrayList<Integer>();
        List<String> al2=new ArrayList<String>();

        al.add(10);
        al.add("TARANATH");
        al.add("RAM");
        al.add('A');
        al.add(true);

        al.add(0,"FIREFLINK");



        System.out.println("ArrayList Data is : "+al); //[10, TARANATH, RAM, A, true]

        //size
        System.out.println("Size of the array list is : "+al.size());

        //remove
        al.remove(0);
        al.remove("RAM");



        System.out.println("After removing the data array list is : "+al);

        Object[] arrayVal = al.toArray();



    }
}
