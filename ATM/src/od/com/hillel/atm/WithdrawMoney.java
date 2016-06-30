package od.com.hillel.atm;

import java.util.Scanner;


public class WithdrawMoney {
    public int totalMoneyATM;
    public int getMoneyATM;
    public int money;
    MainMenuATM mainMenuATM;
    CheckBalance checkBalance;
    Person person;
/*
    private void WithdrawMoney(int totalMoneyATM){
        this.totalMoneyATM = totalMoneyATM;
    }
*/

    public int getMoneyATM(int getMoney) {
        int temp = totalMoneyATM - getMoney;
        return getMoney;
    }


    public WithdrawMoney(int totalMoneyATM, int money) {
        this.getMoneyATM = getMoneyATM;
        this.totalMoneyATM = totalMoneyATM;
        this.money = money;
    }

    public void checkMoneyOnAccount() {

    }

    public void withdraw() throws InsufficientFundsException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Withdraw money:");
        System.out.println("1 - " + Money.FIFTY_GRYVIEN);
        System.out.println("2 - " + Money.ONE_HUNDRED_GRYVIEN);
        System.out.println("3 - " + Money.TWO_HUNDRED_GRYVIEN);
        System.out.println("4 - " + Money.FIVE_HUNDRED_GRYVIEN);
        System.out.println("5 - Back to main menu");
        int in = scanner.nextInt();

        switch (in) {
            case 1:
                withdrawCash(Money.FIFTY_GRYVIEN.getNominal());
                withdraw();
                mainMenuATM.chooseFunction();
                break;
            case 2:
                withdrawCash(Money.ONE_HUNDRED_GRYVIEN.getNominal());
                withdraw();
                mainMenuATM.chooseFunction();
                break;
            case 3:
                withdrawCash(Money.TWO_HUNDRED_GRYVIEN.getNominal());
                withdraw();
                mainMenuATM.chooseFunction();
                break;
            case 4:
                withdrawCash(Money.FIVE_HUNDRED_GRYVIEN.getNominal());
                withdraw();
                mainMenuATM.chooseFunction();
                break;
            case 5:
                mainMenuATM.chooseFunction();
                break;
            default:
                System.out.println("Incorrect choice!");
                break;
        }
        return;
    }

    public void withdrawCash(int getMoneyATM) {
        totalMoneyATM = totalMoneyATM - getMoneyATM;
        money = money - getMoneyATM;
        checkBalance.printTicket(money);
    }

    public boolean checkMoneyInATM() throws InsufficientFundsException {    // 2.3.2.3. Проверка наличных в АТМ
        if (totalMoneyATM < money) {
            throw new InsufficientFundsException("No money in ATM!");
        }
        return true;
    }


}