package com.company;

public class practice3 {
    public static void main(String [] argv){
        final double length=50;
        final double interest;
        double square,cube,deposit;
        int i;
        deposit=200000;
        interest=0.3;
        for(i=1;i<5;i++) {
            deposit=deposit*(1+interest);
        }
        System.out.println(deposit);
        square=Math.pow(length,2);
        cube=Math.pow(length,3);
        System.out.println(square);
        System.out.println(cube);

    }
}
