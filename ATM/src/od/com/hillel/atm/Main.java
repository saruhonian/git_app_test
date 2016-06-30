package od.com.hillel.atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InsufficientFundsException {

        ATM atm = ATM.getInstance();
        atm.insertCard();

        //WithdrawMoney withdrawMoney = new WithdrawMoney();
        //withdrawMoney.getMoneyATM(3000);


    }
}
