package w08dot2;

public class bankAccount {
    int accountNumber;
    double balance;

    bankAccount() {
        accountNumber = 0;
        balance = 0.0;
    }

    /**
     * the makeDeposit method
     * Purpose: Add funds to account
     */
    public double makeDeposit(double depositAmount){
        return this.balance += depositAmount;
    }

    /**
     * the makeWithdrawal method
     * Purpose: Remove funds to account
     */
    public double makeWithdrawal(double withdrawalAmount){
        return this.balance -= withdrawalAmount;
    }
}
