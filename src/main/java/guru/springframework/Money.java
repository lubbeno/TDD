package guru.springframework;

public class Money implements Expression {

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money frank(int amount) {
        return new Money(amount, "CHF");
    }

    private int amount;
    protected String currency;


    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    protected int getAmount() {
        return amount;
    }


    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount && this.currency==money.currency;
    }

    protected String currency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    public Money times(int multiplier) {
        return new Money(getAmount() * multiplier, this.currency);

    }

    public Expression plus(Money added){
        return  new Money(amount + added.amount, currency);
    }
}
