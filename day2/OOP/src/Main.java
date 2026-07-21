public class Main{
    public static void main(String[] args) {
        Payment[] payments = {
                new Card("Ali", 500),
                new Wallet("Sara", 300),
                new Card("Omar", 200)
        };

        double totalPaid = 0;

        for (int i =0;i<payments.length;i++) {
            totalPaid += payments[i].pay(100);
        }

        System.out.println("Total paid: " + totalPaid);
    }
}



