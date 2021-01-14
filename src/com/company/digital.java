package com.company;

public class digital {
    public static void main(String [] argv){
        double a=1.1*3;
        double b=3.3*1;
        int i=4,j=3;
        Boolean c=false,d=true;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("a=b\t"+(a==b));
        System.out.println("c !c=\t"+c+"\t"+!c);

        System.out.println("c,d="+c+"\t"+d);
        System.out.println("c&d="+(c&d));
        System.out.println("c&&d="+(c&&d));
        System.out.println("c|d="+(c|d));
        System.out.println("c||d="+(c||d));
        System.out.println("c^d="+(c^d)+"\n");
        System.out.println("i="+i+"\tj="+j+(true|(i==j++)));
        System.out.println("i="+i+"\tj="+j);
        i=4;
        j=3;
        System.out.println("i="+i+"\tj="+j+(true||(i==j++)));
        System.out.println("i="+i+"\tj="+j);
    }
}
