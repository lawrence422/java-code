import java.util.*;

public class W1Q6 {
    public static void main(String[] args) {
        System.out.print("Please input your grade.");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();

        if (grade >= 85)
            System.out.println("High Distinction");
        if (grade >= 75 && grade < 85)
            System.out.println("Distinction");
        if (grade >= 65 && grade < 75)
            System.out.println("Credit");
        if (grade >= 50 && grade < 65)
            System.out.println("Pass");
        if (grade >= 0 && grade < 50)
            System.out.println("Fail");
    }
}
