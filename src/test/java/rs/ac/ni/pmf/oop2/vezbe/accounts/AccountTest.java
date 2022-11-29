package rs.ac.ni.pmf.oop2.vezbe.accounts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTest
{
    final Account account = new Account(1, "Test");

    @BeforeEach
    public void init()
    {
        account.credit(1000);
    }

    @Test
    public void shouldFailOnNegativeAmount()
    {
        assertThat(account.debit(-5)).isEmpty();
    }

    @Test
    public void shouldFailWhenNotEnoughFunds()
    {
        assertThat(account.debit(1500)).isEmpty();
    }

    @Test
    public void shouldSuccessfullyWithdraw()
    {
        Optional<Integer> result = account.debit(200);

        final int newBalance = result.get();

        assertThat(newBalance).isEqualTo(800);
    }
}