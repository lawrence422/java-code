package com.company;

public class Main {

    public static void main(String[] args) {
        int a,b,c;
        int j=4;
        double pi=3.14159;
        int d=0b11010100;
        boolean test=false;
        System.out.println("test:"+test);
	    System.out.println("my master branch.");
	    System.out.println("branch1");
		System.out.println("int:"+j);
		System.out.println("pi:"+pi);
		for(c=0;c<1;c++) {
			for (a = 0; a <= 10; a++) {
				if (a < 5) {
					for (b = 0; b <= a; b++) {
						System.out.print("*");
					}
					System.out.print("\n");
				} else {
					for (b = 10; b >= a; b--) {
						System.out.print("*");
					}
					System.out.print("\n");
				}
			}
		}
    }
}
