package com.company;

public class main2 {
    public static void main(String[]argv){
        char ch='\u0057';
        char ch2='x';
        char ch3='\'';
        int i,xuni;

        String s1="23456";
        System.out.println(s1+'\t'+s1.length());
        System.out.println(ch3+"\t"+Integer.toHexString(ch3));

        xuni=ch2;
        System.out.print("x="+xuni+"\t"+Integer.toHexString(xuni)+"\t" );
        System.out.println(ch);
        for (i=97;i<100;i++) {
            ch = (char) i;
            System.out.print(i+"\t");
            System.out.print(Integer.toHexString(i)+"\t");
            System.out.print(ch);
            System.out.print("\t");
            if(i%20==0){
                System.out.print('\n');
            }
        }
    }

}
