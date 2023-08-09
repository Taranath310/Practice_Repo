package org.java.practise;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseDataInArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
