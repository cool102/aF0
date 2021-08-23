package lesson14.task0.model;

public class Account {
    private String accountType;
    private String accountNumber;
    private double accountBalance;

    public Account(String accountType, String accountNumber, int accountBalance) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountType='" + accountType + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
