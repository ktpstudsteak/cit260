package w08dot2;

public class w08dot2 {

    public static void main(String[] args) {
        bankAccount ac = new bankAccount();

        ac.accountNumber = 123;
        ac.makeDeposit(5.00);

        System.out.printf("""
                            This program tests the BankAccount class by ...
                            ...Creating account number %x with an initial balance of $%.2f
                            ...Making a deposit of $%.2f
                            ...Making a deposit of $%.2f
                            ...Making a withdrawal of $%.2f
                            The balance in account number %x is $%.2f
                            Goodbye...
                            """
                , ac.accountNumber, ac.balance, ac.makeDeposit(10.5), ac.makeWithdrawal(3.25),
                ac.makeWithdrawal(1.50), ac.accountNumber, ac.balance
        );
    }
}
