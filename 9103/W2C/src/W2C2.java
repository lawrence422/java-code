import java.util.*;

public class W2C2 {
    public static void main(String[] args) {
        int[] occurence = new int[10];
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] number = new char[s.length()];
        number = s.toCharArray();

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < 10; j++)
                if (j == ((int) number[i] - (int) '0'))
                    occurence[j]++;
        }

        for (int k = 0; k < occurence.length; k++)
            System.out.println(k + ": " + occurence[k]);
    }
}
//Occurrence
//        You are tasked with writing a program that will read in a string and count the frequency of that number.
//        You only need to count the numbers in the range [0-9] inclusive.
//        You can assume you do not need to deal with invalid input.
