import java.math.BigDecimal;

public class fractional {
    public static void main(String[]args){
        float numberOfFloat1=0.1f;
        float numberOfFloat2=0.2f;
        double numberOfDouble1=0.1;
        double numberOfDouble2=0.2;
        BigDecimal a=new BigDecimal(0.1);
        BigDecimal b=new BigDecimal(0.2);
        BigDecimal c=new BigDecimal(0.3);

        System.out.printf("%.20f, %b\n",(numberOfFloat1+numberOfFloat2),(numberOfDouble1+numberOfDouble2==0.3));
        System.out.printf("%.20f, %b\n",(numberOfDouble1+numberOfDouble2),(numberOfDouble1+numberOfDouble2==0.3));
        System.out.printf("%.20f, %b\n",(a.add(b)),(a.add(b).compareTo(c)));


    }
}
