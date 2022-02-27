import java.util.*;
public class Account {
    //declare variables
    private int ID;
    private double Balance;
    private double AnnualInterestRate;
    private Date dateCreated;

    // constructor no arg
    public Account(){
        ID = 0;
        Balance = 0;
        AnnualInterestRate = 0;
        dateCreated = new Date();
    };

    // constructor
    public Account (int id, double balance){
        ID = id;
        Balance = balance;
        dateCreated = new Date();
    }

    // accessor and mutator
    public void setID(int id) {
        ID = id;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        AnnualInterestRate = annualInterestRate/100;
    }

    public int getID() {
        return ID;
    }

    public double getBalance() {
        return Balance;
    }

    public double getAnnualInterestRate() {
        return AnnualInterestRate;
    }

    // accessor for date
    public Date getDateCreated() {
        return dateCreated;
    }

    // MonthlyInterestRate
    public double getMonthlyInterestRate(){
        return AnnualInterestRate/12;
    }

    //MonthlyInterest
    public double getMonthlyInterest(){
        return getMonthlyInterestRate()* Balance;
    }

    //withdraw
    public void withdraw(double withdrawAmount){
        Balance = Balance - withdrawAmount;
    }

    //deposit
    public void deposit(double depositAmount){
        Balance = Balance + depositAmount;
    }

}
