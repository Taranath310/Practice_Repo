package org.java.practise;

public class ConstructDemo {
    ConstructDemo(){
        System.out.println("construct with_out param");
    }

    ConstructDemo(String name){
        System.out.println(name +" construct with param");
    }


    public static void main(String[] args) {
        new ConstructDemo();
        new ConstructDemo("Taranath");
    }
}
