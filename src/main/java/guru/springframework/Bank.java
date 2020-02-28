package guru.springframework;

public class Bank {
    Money reduce(Expression source, String tocurrency){
        Sum sum = (Sum)source;
        int amount = sum.augmend.getAmount() + sum.addmend.getAmount();
        return new Money(amount,tocurrency);
    }
}
