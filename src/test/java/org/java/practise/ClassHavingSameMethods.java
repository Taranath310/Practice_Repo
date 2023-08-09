package org.java.practise;

public class ClassHavingSameMethods {
    public static void main(String[] args) {
        SecondClass sc=new SecondClass();
        sc.add1();
    }
}
class FirstClass{
void add1(){
    System.out.println("FirstClass");
}
}
class SecondClass extends FirstClass{
    void add2(){
        System.out.println("SecondClass");
    }
}
