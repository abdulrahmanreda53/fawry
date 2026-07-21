public class Wallet extends Payment {
    public Wallet(String owners, double balances) {
        super(owners, balances);
    }

    @Override
    public double pay(double amount) {
        balances-=amount;
        System.out.println(owners + "wallet paid:" + amount + "balances:" + balances);
        return amount;
    }
}