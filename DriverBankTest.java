public class DriverBankTest {
  public static void main(String[]args){
    BankAccount act = new BankAccount(100, 1, "boolean");
    BankAccount sat = new BankAccount(7000, 2, "expression");

    System.out.println("act:");
    System.out.println(act.getBalance());
    System.out.println(act.getAccountID());
    System.out.println("sat:");
    System.out.println(sat);

    if (act.withdraw(1000)){
           System.out.println("Withdrawal success!");
      }
      else{
           System.out.println("Withdrawal failure");
      }

    if (sat.deposit(1000)){
           System.out.println("Withdrawal success!");
      }
      else{
           System.out.println("Withdrawal failure");
      }

  }
}
