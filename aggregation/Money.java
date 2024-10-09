package aggregation;
public class Money {
    private int dollars;
    private int cents;



    public Money(int dollars, int cents) {
        if (cents >= 100) {
            dollars += cents / 100;
            cents = cents % 100;
        }
        this.dollars = dollars;
        this.cents = cents;
    }

    
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    
    public boolean equals(Money other) {
        return this.dollars == other.dollars && this.cents == other.cents;
    }


    public int compareTo(Money other) {
        if (this.dollars > other.dollars || (this.dollars == other.dollars && this.cents > other.cents)) {
            return 1;
        } else if (this.equals(other)) {
            return 0;
        } else {
            return -1;
        }
    }

    
    public void add(Money other) {
        this.dollars += other.dollars;
        this.cents += other.cents;
        if (this.cents >= 100) {
            this.dollars++;
            this.cents -= 100;
        }
    }

    
    public void subtract(Money other) {
        int totalCents = this.dollars * 100 + this.cents;
        int otherCents = other.dollars * 100 + other.cents;
        totalCents -= otherCents;

        this.dollars = totalCents / 100;
        this.cents = totalCents % 100;
    }

    
    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}
