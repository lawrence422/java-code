import java.util.Scanner;
import java.util.ArrayList;

public class W2Q1 {
    static int countVowels(String s) {
        int count=0;
        if(s==null)
            return -1;
        char[]c=new char[s.length()];
        c=s.toCharArray();
        ArrayList<Character> list = new ArrayList<Character>();
        char[] array = new char[] {'a', 'e', 'i','o','u'};

        for (char i:array)
            list.add(i);

        for (int i=0;i<c.length;i++) {
                if (list.contains(c[i]))
                    count++;
            }

        return count;
    }

    public static void main(String[] args) {
        String s = "astronaut";
        int count = countVowels(s);

        System.out.println("Number of count: " + count); //4
    }
}