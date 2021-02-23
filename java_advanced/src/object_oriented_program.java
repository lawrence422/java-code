
class ICcard {
    long id;
    int money;

    void showInfo() {
        System.out.println("card number = " + id);
        System.out.println("Balance = " + money);
    }
}

public class object_oriented_program {
    public static void main(String... argv) {

        ICcard my_Card = new ICcard();

        my_Card.id = 0X336789AB;
        my_Card.money = 300;
        my_Card.showInfo();

    }
}
