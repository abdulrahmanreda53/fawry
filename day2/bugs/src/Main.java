public class Main{
    public static void main(String[] args) {
        String[] owners   = {"Ali", "Sara", "Omar"};
        String[] types    = {"card", "wallet", "card"};
        double[] balances = {500, 300, 200};
        double amount = 100;

        double totalPaid = 0;
        for (int i = 0; i < owners.length; i++) {
            if (types[i].equals("card")) {
                balances[i] = balances[i] - amount;
                totalPaid += amount;
                System.out.println(owners[i] + " card paid " + amount + ", balance " + balances[i]);
            } else if (types[i].equals("wallet")) {
                balances[i] = balances[i] - amount;
                totalPaid += amount;
                System.out.println(owners[i] + " wallet paid " + amount + ", balance " + balances[i]);

            }
        }
        System.out.println("total paid: " + totalPaid);
    }
}
