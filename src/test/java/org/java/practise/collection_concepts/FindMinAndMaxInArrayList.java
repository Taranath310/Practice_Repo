package org.java.practise.collection_concepts;

import java.util.ArrayList;
import java.util.Collections;

public class FindMinAndMaxInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(100);
        arrayList.add(500);
        arrayList.add(34);
        arrayList.add(1500);


        System.out.println("array list elements are: "+arrayList);

        Integer minValue = Collections.min(arrayList);
        Integer maxValue = Collections.max(arrayList);

        System.out.println(minValue);
        System.out.println(maxValue);
    }
}
