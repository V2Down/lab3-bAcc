//------------------------------------------------------
// Lab 4
// Written by: Alexis Ortega-Ceballos 1948124
// For SES350 Section 601 – Spring 2025
//--------------------------------------------------------

/*
 In this code we added the inability to withdraw if the balance is zero
 also we added a 1% interest extra to the deposit amount
*/
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
  private String accountNumber;
  private double balance;
  private List<String> transactionHistory;
  private boolean isActive;
  
  public BankAccount(String accountNumber) {
    this.accountNumber = accountNumber;
    this.balance = 0.0;
    this.transactionHistory = new ArrayList<>();
    this.isActive = true;
  }
  
  public void withdraw(double amount) {
    if (balance == 0) {
      return;
    }
    balance -= amount;
    transactionHistory.add("Withdrawal: -" + amount);
  }
  
  public void deposit(double amount) {
    amount += amount * 0.01;
    balance += amount;
    transactionHistory.add("Deposit: +" + amount);
  }
}