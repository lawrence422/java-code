import java.util.*;

public class W1C6 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even.");
            return;
        }

        System.out.println("The number " + number + " is odd.");
    }
}
//    Odd or Even
//        Write a program that asks the user for a number from standard input and then displays whether the number is odd or even.
