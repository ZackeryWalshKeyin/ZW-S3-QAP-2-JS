public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.balance = new Money(0); // Initialize balance to zero
        this.creditLimit = new Money(creditLimit); // Use copy constructor for credit limit
    }

    public Money getBalance() {
        return new Money(balance); // Return a copy to prevent direct manipulation of balance
    }

    public Money getCreditLimit() {
        return new Money(creditLimit); // Return a copy to prevent direct manipulation of credit limit
    }

    // Method to charge amount to the credit card
    public void charge(Money amount) {
        if (balance.getAmount() + amount.getAmount() <= creditLimit.getAmount()) {
            balance.setAmount(balance.getAmount() + amount.getAmount());
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    // Method to make a payment on the credit card
    public void makePayment(Money amount) {
        balance.setAmount(balance.getAmount() - amount.getAmount());
        System.out.println("Payment: " + amount);
    }

    @Override
    public String toString() {
        return "Owner: " + owner + "\nBalance: " + balance + "\nCredit Limit: " + creditLimit;
    }
}