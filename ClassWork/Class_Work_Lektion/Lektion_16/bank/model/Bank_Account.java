package Lektion_16.bank.model;

public class Bank_Account {

    private long account;
    private String owner;
    private String bank;
    private int branch;
    private double balance;

    public Bank_Account(long account, String owner, String bank, int branch, double balance) {
        this.account = account;
        this.owner = owner;
        this.bank = bank;
        this.branch = branch;
        this.balance = balance;
    }

    public  Bank_Account(long account, String owner, String bank, int branch) {
        this.account = account;
        this.owner = owner;
        this.bank = bank;
        this.branch = branch;
    }

    public Bank_Account(long account, String bank, int branch, double balance) {
        this.account = account;
        this.bank = bank;
        this.branch = branch;
        this.balance = balance;
    }

    public void deposit(double sum) {
        balance = balance + sum;
    }

    public boolean withdraw(double sum) {
        if (sum <= balance) {


        balance = balance - sum;
        return true;

    }

    return false;
    }
    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = account;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void display () {
        System.out.println("Acc:," + account + " owner:, " + owner + " bank:, " + bank +  " branch:, " + branch + " balance:, " + balance ) ;
    }
}
