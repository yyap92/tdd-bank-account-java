package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
	@Disabled
    public void depositAnAmountToIncreaseTheBalance() {
        assertThat("your first test").isBlank();
    }

    @Test
    public void newAccountShouldHaveZeroBalance(){
        Account account = new Account();
        assertThat(account.getBalance()).isEqualTo(0);
    }

    @Test
    public void depositAnAmountShouldIncreaseBalance(){
        Account account = new Account();
        account.deposit(10);
        assertThat(account.getBalance()).isEqualTo(10);
    }

    @Test
    public void multipleDepositAnAmountShouldIncreaseBalanceBySum(){
        Account account = new Account();
        account.deposit(10);
        account.deposit(10);
        account.deposit(10);
        assertThat(account.getBalance()).isEqualTo(30);
    }

    @Test
    public void multipleWithdrawAnAmmountShouldDecreaseBalanceBySum(){
        Account account = new Account();
        account.withdraw(10);
        account.withdraw(10);
        assertThat(account.getBalance()).isEqualTo(-20);
    }

}
