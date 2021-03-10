import java.util.Scanner;

public class W1C2 {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        System.out.println("Hello, " + s + "!");

    }
}
//     Greetings
//        Write a program that asks a user for their name from standard input, and then outputs "Hello, <name>!"
