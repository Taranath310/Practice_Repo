/**
 * User:Taranath
 * Date:26-09-2023
 * Time:13:43
 */


package org.java.practise;

import java.util.ArrayList;
import java.util.List;

public class CheckRemoveAllInCOllection {
    public static void main(String[] args) {
        List<String> email=new ArrayList<>();
        email.add("TARA");
        email.add("RUTU");
        email.add("DADA");

        List<String> email2=new ArrayList<>();
        email2.add("TARA");
        email2.add("123");
        email2.add("XYZ");
//
//        email.removeAll(email2);
//        System.out.println(email);
        email.retainAll(email2);
        System.out.println(email);


    }
}
