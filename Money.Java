public class Money {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    // Copy constructor
    public Money(Money money) {
        this.amount = money.amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "$" + amount;
    }
}