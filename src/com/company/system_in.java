package com.company;
import java.util.*;

public class system_in {
    public static void main(String[]argv){
        int apple,people=7,q,r;
        System.out.print(people);
        Scanner sc=new Scanner(System.in);
        apple=sc.nextInt();
        q=apple/people;
        r=apple%people;
        System.out.println(q+"..."+r);

    }
}
