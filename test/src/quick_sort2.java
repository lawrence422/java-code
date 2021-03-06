class Sorter {
    int[] data;

    void quick_Sort(int start, int end) {

        int left = start;
        int right = end;
        int mid = (start + end) / 2;

        if (start>=end)
            return;

        while (left < right) {
            while ((left < end) && (data[left] < data[mid]))
                left++;
            while ((right > start) && (data[right] > data[mid]))
                right--;

            if (left <= right) {
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
                show();
            }
        }
        quick_Sort(start, right);
        quick_Sort(left, end);
    }

    void show() {
        for (int i : data)
            System.out.print(i + "\t");
        System.out.println();
    }

    void sort(int[] data) {
        this.data = data;
        show();
        quick_Sort(0, data.length - 1);

    }
}


public class quick_sort2 {
        public static void main(String... argv) {
            int k = 5;
            int[] data = new int[k];

            for (int i = 0; i < k; i++)
                data[i] = (int) (Math.random() * 100) + 1;

            Sorter s = new Sorter();
            s.sort(data);


    }
}
