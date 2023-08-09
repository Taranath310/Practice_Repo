package org.selenium.practise;

public class SampleEX {

int value=10;
    static void add(){
        System.out.println("add method");
    }


    static void add1(int a,int b){
        int result=a+b;
    }

    static void add11(SampleEX e){
        System.out.println("hello");
    }
    void mul(){
        System.out.println("mul method");
    }

    public static void main(String[] args) {
        SampleEX se=new SampleEX();
        int a=19;
        se.mul();
        add1(1,5);
        add11(se);
    }
}
