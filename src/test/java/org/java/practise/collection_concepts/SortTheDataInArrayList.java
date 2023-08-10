package org.java.practise.collection_concepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortTheDataInArrayList {
    public static void main(String[] args) {


        ArrayList al=new ArrayList();
        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("B");
        al.add("A");
        System.out.println("Before sorting : "+al);

        //sort the data
        Collections.sort(al);
        System.out.println("After sorting : "+al);


        //sort the data in reverseOrder
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("After sorting in revers order: "+al);

    }
}
