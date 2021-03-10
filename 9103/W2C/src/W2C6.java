import java.util.*;
public class W2C6 {
    static int countDuplicates(int[] a) {
        if(a==null)
            return 0;
        ArrayList <Integer>list = new ArrayList<Integer>();

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j])
                    if (list.contains(a[i]) == false)
                        list.add(a[i]);
            }
        }
        return list.size();
    }

    public static void main(String[] args) {
        int[] dups = {1, 1, 5, 6, 5, 3, 8, 1, 9, 2, 8};
        int result = countDuplicates(dups);

        System.out.println(result);
    }
}
//    Count Duplicates
//    You are tasked with writing a method that will count the number of elements that contain a duplicate entry.
//        In the event that null is passed your method should return 0. Be aware of overcounting.
