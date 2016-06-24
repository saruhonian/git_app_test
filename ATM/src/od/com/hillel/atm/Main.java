package od.com.hillel.atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();
        //atm.setMoneyATM(200000);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter yor name: ");
        String user = scanner.next();
        MainMenuATM mainMenuATM = new MainMenuATM();
        System.out.println("Choose function: ");
        System.out.print("1. Withdraw money (Enter '1') >> ");
        System.out.print("2. Check balance (Enter '2') >> ");
        String function = scanner.next();
        mainMenuATM.chooseFunction(function);




        WithdrawMoney withdrawMoney = new WithdrawMoney();
        withdrawMoney.getMoneyATM(3000);





        try {
            withdrawMoney.checkMoneyInATM();
        } catch (InsufficientFundsException insufficientFundsException) {
            System.out.println(insufficientFundsException.getMessage());
        }


    }
}
