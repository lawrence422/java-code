package com.company;
import java.util.*;
public class practice4_2 {
    public static void main(String...argv){
        int i;
        System.out.println("how many dollars do you have?");
        Scanner sc= new Scanner(System.in);
        i= sc.nextInt();
        System.out.println("thousand:"+i/1000+"\n"+"hundred:"+i%1000/100+"\n"+"ten:"+i%100/10+"\n"+i%10);

    }
}
