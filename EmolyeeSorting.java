package com.employee;
import java.util.*;

public class Employee{

    public static void main(String[] args){

    
    String str[] ={"Chaitanya","Sushant","Nayan","Vaibhav","Kirti"};
    String temp;
    System.out.println("Strings in sorted order");
    for (int j=0; j< str.length; j++){
        for(int i= j+1; i< str.length; i++){
            if(str[i].compareTo(str[j])<0){
                temp =str[j];
                str[j]=str[i];
                str[i]=temp;

            }
        }
        System.out.println(str[j]);
    }

    }
}
