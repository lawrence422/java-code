import java.util.*;

public class arg {

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

        for (int k=0;k<occurence.length;k++)
            System.out.println(k+": "+occurence[k]);
    }

}
