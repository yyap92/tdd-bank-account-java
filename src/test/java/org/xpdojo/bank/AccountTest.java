package org.xpdojo.bank;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.xpdojo.bank.Account.emptyAccount;

public class AccountTest {

    private final Account account = emptyAccount();

    @Test
    public void newAccountShouldHaveZeroBalance(){
        assertThat(account.getBalance()).isEqualTo(0);
    }

    @Test
    public void depositAnAmountShouldIncreaseBalance(){
        account.deposit(10);
        assertThat(account.getBalance()).isEqualTo(10);
    }

    @Test
    public void multipleDepositAnAmountShouldIncreaseBalanceBySum(){
        account.deposit(10);
        account.deposit(10);
        account.deposit(10);
        assertThat(account.getBalance()).isEqualTo(30);
    }

    @Test
    public void multipleWithdrawAnAmmountShouldDecreaseBalanceBySum(){
        account.withdraw(10);
        account.withdraw(10);
        assertThat(account.getBalance()).isEqualTo(-20);
    }


}
