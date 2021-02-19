public class park {

    public static void main(String... argv) {
        int hour[] = {0, 2, 4, 6};
        int fee[] = {30, 50, 80, 100};
        int total_hour = Integer.parseInt(argv[0]);
        int total_fee = 0;
        int i = hour.length - 1;

        while (i > 0) {

            if (hour[i] < total_hour)
                break;

            i--;

        }

        while (i >= 0) {

            total_fee += (total_hour - hour[i]) * fee[i];
            total_hour = hour[i];
            i--;

        }

        System.out.println("total hour = " + argv[0] + " hours");
        System.out.println("fee = " + total_fee + " dollars");


    }
}
