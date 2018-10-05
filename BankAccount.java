// 10/3/18
public class BankAccount {
  // instance variables
  private double balance;
  private int accountID;
  private String password;

  // Constructor
  /*Sole constructor requires all field's values*/
  public BankAccount(double balance, int accountID, String password) {
    this.balance = balance;
    this.accountID = accountID;
    this.password = password;
  }

  // Accessor Methods
  public double getBalance() {
    return balance;
  }
  public int getAccountID() {
    return accountID;
  }
  // Set Method
  public void setPassword(String newPass) {
    password = newPass;
  }
  // toString
  /*Return a String to be used to display the account data. "ACCOUNT\tBALANCE" */
  public String toString() {
    return "" + accountID + "\t" + balance + "";
  }
  // Deposit and Withdrawl
  /*Only when amount is positive: Increase balance by amount and return true.
 *@return When amount is positive: Return true, otherwise return false.
 *@param amount The amount is how much to change the balance by.
 */
  public boolean deposit(double amount) {
    if (amount >= 0) {
      balance += amount;
      return true;
    }
    return false;
  }
  /*Only when amount is positive and the amount does not exceed the balance:
 *Decrease balance by amount and return true, return false otherwise.
 *Make no change if the amount is too large to withdraw
 *@param amount The amount is how much to change the balance by.
 *@return true when the balance is large enough, false otherwise.
 */
  public boolean withdraw(double amount) {
    if (amount >= 0 && balance > amount) {
      return true;
    }
    return false;
  }

// Part 2
  private boolean authenticate(String password) {
    return this.password.equals(password);
  }

  //Transfer money from this BankAccount to the other only when the password //matches, and the withdrawal succeeds.

  public boolean transferTo(BankAccount other, double amount, String password) {
    return other.authenticate(password) && this.withdraw(amount) && other.deposit(amount);
  }
}
