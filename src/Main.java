import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name,password and initial balance");
        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();
        SBIAccount pushpendraAcc = new SBIAccount(name, balance, password);
        System.out.println("Your current balance has been created with account number:" + pushpendraAcc.getAccountNo());

        // getBalance
        System.out.println("Your current balance is:" + pushpendraAcc.getBalance());

        //deposit
        System.out.println(pushpendraAcc.depositMoney(500));
        System.out.println("New balance is:"+pushpendraAcc.getBalance());

        //withdraw
        System.out.println("Enter amount to be withdraw ");
        int amount = sc.nextInt();
        System.out.println("Enter your password ");
        String enteredPassword = sc.next();

        System.out.println(pushpendraAcc.withdraw(amount,enteredPassword));
        System.out.println("Current balance is:"+pushpendraAcc.getBalance());

        // interest

        System.out.println("Interest for 4 years o current balance"+pushpendraAcc.getBalance()+"is"+pushpendraAcc.calculateInterest(4));

    }
}