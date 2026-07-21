public abstract class Payment {
    protected String owners;
    protected double balances;

    public Payment(String owners, double balances) {
        this.owners = owners;
        this.balances = balances;
    }

    public String getOwners() {
        return owners;
    }

    public void setOwners(String owners) {
        this.owners = owners;
    }

    public double getBalances() {
        return balances;
    }

    public void setBalances(double balances) {
        this.balances = balances;
    }

    public abstract double pay(double amount);
}
