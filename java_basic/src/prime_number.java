import java.util.*;

public class prime_number {

    public static void main (String... argv){

        int input, i, j=0;
        System.out.println("input");
        Scanner sc= new Scanner(System.in);
        input= sc.nextInt();

        for (i=2; i<=(input/2); i++ ){
            if (input%i==0){
                System.out.print(i+"\t");
                j+=1;
            }
        }

        if (j==0){
            System.out.println(input+" is prime.");
        }
        else{
            System.out.println(input+" is not prime, it has "+j+" factor");
        }

    }
}
