public class max25 {
    public static void main (String... argv){

        int i,j,sum;

        here: for (i=1; i<=9; i++){

            for (j=1; j<=9; j++){
              sum=i*j;
              if(sum>25){
                  System.out.println();
                  continue here;
              }
              System.out.print(i+"*"+j+"="+sum+"\t");
            }

            System.out.println();
        }


    }

}
