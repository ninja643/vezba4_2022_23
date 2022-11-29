package rs.ac.ni.pmf.oop2.vezbe.accounts;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
public class Account
{
    private final int id;
    private String name;
    private int balance;

    public Account(final int id, final String name)
    {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public int credit(final int amount)
    {
        if (amount > 0)
        {
            balance += amount;
        }
        else
        {
            System.out.println("Amount must be positive");
        }

        return balance;
    }

    public Optional<Integer> debit(final int amount)
    {
        if (amount <= 0)
        {
            System.out.println("Amount must be positive");
            return Optional.empty();
        }
        else if (amount > balance)
        {
            System.out.println("Not enough funds!");
            return Optional.empty();
        }
        else
        {
            balance -= amount;
        }

        return Optional.of(balance);
    }

    public Optional<Integer> transferTo(final Account otherAccount, final int amount)
    {
        final Optional<Integer> optionalBalance = debit(amount);

        if (optionalBalance.isEmpty())
        {
            System.out.println("Transaction failed!");
            return Optional.empty();
        }

        otherAccount.credit(amount);
        return Optional.of(balance);
    }
}
