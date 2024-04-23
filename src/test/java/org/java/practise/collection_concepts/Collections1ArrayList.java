package org.java.practise.collection_concepts;

import java.util.ArrayList;
import java.util.List;

public class Collections1ArrayList {
    public static void main(String[] args) {
        //declaration
        ArrayList al=new ArrayList();
        ArrayList<Integer> al1=new ArrayList<Integer>();
        List<Integer> al2=new ArrayList<Integer>();

        al.add(10);
        al.add("TARANATH");
        al.add("RAM");
        al.add('A');
        al.add(true);

        al.add(0,"FIREFLINK"); //inserting value at specific index.

        System.out.println("ArrayList Data is : "+al);

        al1.add(11);
        al1.add(23);
        al1.add(33);

        al.addAll(al1); // adding all the values from one arraylist to another.

        System.out.println("ArrayList Data is : "+al);

        //size
        System.out.println("Size of the array list is : "+al.size());

        //remove
        al.remove(0);
        al.remove("RAM");
        System.out.println("After removing the data array list is : "+al);

        //remove all
        al.removeAll(al1);
        System.out.println("After removing all the data array list is : "+al);

        al2.add(10);

        al.retainAll(al2);


        //set the value
        al.set(0,"JAVA");

        //get the value
        System.out.println(al.get(0));

        //printing values from arraylist

        //using for loop
            for(int i=0;i<al1.size();i++){
                System.out.println(al1.get(i));
            }

        System.out.println("*********************************************************");

        //using for-each loop
            for(Object obj:al1){
                System.out.println(obj);
            }


        System.out.println("Checking is the al1 arraylist is empty : "+al1.isEmpty());

            al1.clear();

        System.out.println("Checking is the al1 arraylist is empty : "+al1.isEmpty());


        Object[] arrayVal = al.toArray();
    }
}
