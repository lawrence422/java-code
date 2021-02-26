
class Sorter {
    int[] data;
    int recursive = 1;

    void quickSort(int start, int end) {

        if(recursive>1)
            System.out.println("left = "+(start+1)+"\tmid = "+((start + end)/2+1)+"\t\tright = "+(end+1));

        //if array only has one element, return.
        if (start >= end) {
            System.out.println("start >= end\treturn");
            return;
        }
        //get middle element
        int mid = data[(start + end) / 2];

        int left = start;
        int right = end;

        while (left < right) {
            // sorting toward end
            while ((left < end) && (data[left] < mid)) {
                left++;
            }
            System.out.print((left + 1) + "\t\t");

            // sorting toward frond
            while ((right > start) && (data[right] > mid)) {
                right--;
            }
            System.out.print((right + 1) + "\t>>\t");

            // not yet stagger
            if (left <= right) {
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
                System.out.print((left + 1) + "\t\t" + (right + 1) + "\t\t" + (start + 1) + "\t\t" + ((start + end) / 2 + 1) + "\t\t" + (end + 1) + "\t\t");
                show();

            }
        }
        System.out.println("left < right =\tfalse");
        recursive++;
        System.out.println("quickSort(start: " + (start + 1) + " , right: " + (right + 1) + " )\t\trecursive: " + recursive);

        quickSort(start, right);
        recursive--;
        System.out.println("quickSort(left:  " + (left + 1) + " , end:   " + (end + 1) + " )\t\trecursive: " + recursive);
        quickSort(left, end);
    }

    void show() {
        for (int i : data) {
            System.out.print(i + "  ");

        }
        System.out.println();
    }

    void sort(int[] data) {
        System.out.print("left\tright\tleft\tright\tstart\tmid\t\tend");
        this.data = data;
        System.out.print("\t\t");
        show();
        quickSort(0, data.length - 1);
    }
}


public class quick_sort {
    public static void main(String... argv) {
        int k = 5;
        int[] data = new int[k];

        for (int i = 0; i < k; i++)
            data[i] = (int) (Math.random() * 100) + 1;

        Sorter s = new Sorter();
        s.sort(data);

    }
}
