import java.util.*;

public class white_board {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String s1, s2;
        double a,b;
        System.out.print("Enter two numbers: ");
        s1= sc.next();
        s2= sc.next();
        try {
            a=Double.parseDouble(s1);
            b=Double.parseDouble(s2);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
            return;
        }
        System.out.println(a+"\t"+b);
    }
}
