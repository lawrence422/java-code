import java.util.ArrayList;

public class W2Q6 {
    static int [] union(int []x,int[]y){
        ArrayList<Integer> list=new ArrayList<Integer>();
        int[]c=new int[list.size()];
        for (int i:x)
            list.add(i);

        for (int j=0;j<y.length;j++)
        {
         if (!list.contains(y[j]))
             list.add(y[j]);
        }
        System.out.println(list);
        for (int k=0;k<c.length;k++)
            c[k]=list.get(k);

        return c;
    }
    public static void main(String[]args){
        int[] x = {1, 2, 5, 8, 7};
        int[] y = {3, 1, 2};
        int[] result = union(x, y);
        for (int i:result)
            System.out.println(i);
    }
}