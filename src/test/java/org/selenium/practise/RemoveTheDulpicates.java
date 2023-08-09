package org.selenium.practise;

public class RemoveTheDulpicates {
    static String sample="DELL";
    static String finalValue="";

    public static void main(String[] args) {

        System.out.println(removeDuplicates(sample));

    }
    static boolean isCharacterThere(char value){
        boolean flag=false;
        char[] arrayValue = finalValue.toCharArray();
        for(int i=0;i<arrayValue.length;i++){
            if(value == arrayValue[i]){
                flag=true;
            }
        }
        return flag;
    }
    static String removeDuplicates(String value){
        char[] arrayValue = value.toCharArray();
        for(int i=0;i<arrayValue.length;i++){
            if(isCharacterThere(arrayValue[i])){
               continue;
            }else  finalValue = finalValue + arrayValue[i];
        }
        return finalValue;
    }
}
