package aggregation;
public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

   
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = new Money(creditLimit);  
        this.balance = new Money(0, 0);  
    }

    
    public Money getBalance() {
        return new Money(balance);  
    }

    
    public Money getCreditLimit() {
        return new Money(creditLimit);  
    }

    
    public String getPersonals() {
        return owner.toString();  
    }

    
    public void charge(Money amount) {
        Money tempBalance = new Money(balance);
        tempBalance.add(amount);

        if (tempBalance.compareTo(creditLimit) <= 0) {
            balance.add(amount);
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    
    public void payment(Money amount) {
        balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
