public class Card extends Payment {
    public Card(String owners, double balances) {
        super(owners, balances);
    }
    @Override
    public double pay(double amount){
        balances-=amount;
        System.out.println( owners+ "card paid:"+amount+"balances:"+balances);
        return amount;
    }
}
