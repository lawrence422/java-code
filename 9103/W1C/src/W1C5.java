import java.util.*;

public class W1C5 {
        final static double golden_ratio = (1 + Math.sqrt(5)) / 2;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String s1, s2;
            double a, b;
            System.out.print("Enter two numbers: ");
            s1 = sc.next();
            s2 = sc.next();
            System.out.println();
            try {
                a = Double.parseDouble(s1);
                b = Double.parseDouble(s2);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
                return;
            }
            if (a >= b) {
                if (Math.round(a / b * 1000) % 1618 == 0) {
                    System.out.println("Golden ratio!");
                    return;
                }
                System.out.println("Maybe next time.");
                return;
            }
            if (a < b) {
                if (Math.round(b / a * 1000) % 1618 == 0) {
                    System.out.println("Golden ratio!");
                    return;
                }
                System.out.println("Maybe next time.");
                return;
            }
        }
    }
//    Golden Ratio
