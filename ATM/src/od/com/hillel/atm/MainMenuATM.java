package od.com.hillel.atm;

import java.util.Scanner;

public class MainMenuATM {
  //  private int money;
  public int totalMoneyATM = 200000;
    private static MainMenuATM instance = null;
    Person person;
    Money money;

    private MainMenuATM(Person person){
        this.person = person;
    }


    public static MainMenuATM getInstance(Person person){
        if (MainMenuATM.instance == null) {
            MainMenuATM.instance = new MainMenuATM(person);
        }
        return MainMenuATM.instance;
    }

    CheckBalance checkBalance = new CheckBalance();

    public void chooseFunction() throws InsufficientFundsException {

        System.out.println("Choose function: ");
        System.out.println("1. Withdraw money (Enter '1') >> ");
        System.out.print("2. Check balance (Enter '2') >> ");
        Scanner scanner = new Scanner(System.in);
        String function = scanner.next();
        //Person person;
        switch (function) {
            case "1":
                withdrawMoney();
                break;
            case "2":
                checkBalance();
                break;
        }

    }

    public void withdrawMoney() throws InsufficientFundsException {
        if (checkBalance.checkAccount()) {
            WithdrawMoney withdrawMoney = new WithdrawMoney(totalMoneyATM, person.money, checkBalance);
            if (withdrawMoney.checkMoneyInATM())
                withdrawMoney.withdraw();

        }
    }

    public void checkBalance() {

        if (checkBalance.checkAccount()) {
            checkBalance.printTicket(person.money);
        }
    }

}
