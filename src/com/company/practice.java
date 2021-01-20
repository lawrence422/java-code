package com.company;

public class practice {
    public static void main(String[] args){
        byte i= -2;
        int j=32768;
        System.out.println(+i+"\t"+(Integer.toBinaryString(i)));
        i=(byte) (i>>1);
        System.out.println(+i+"\t"+(Integer.toBinaryString(i)));
        System.out.println(+j+"\t"+(short)j+"\t"+(byte)j);
        j+=3.5;
        System.out.println(+j);

    }
}
