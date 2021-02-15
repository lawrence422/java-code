package com.company;
import java.util.*;

public class practice4_1 {
    public static void main(String...argv){

        int i;
        System.out.println("input");
        Scanner sc=new Scanner(System.in);
        i= sc.nextInt();
        if(i<31){
            System.out.println("2^"+i+"="+Math.pow(2,i));
        }
        else {
            System.out.println("error");
        }

    }
}
