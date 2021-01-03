package com.company;

public class Main {

    public static void main(String[] args) {
        int a,b;
        int j=4;
	    System.out.println("my master branch.");
	    System.out.println("branch1\n");
		System.out.println("int:"+j);

	    for (a=0;a<=10;a++) {
	        if(a<5) {
				for (b = 0; b <= a; b++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
	        else {
				for (b = 10; b >= a; b--) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
        }
    }
}
