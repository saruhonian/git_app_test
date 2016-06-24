package od.com.hillel.atm;

public class MainMenuATM {
    public String chooseFunction(String function) {
        Person person;
        switch (function) {
            case "1": //Withdraw money
                CheckBalance checkBalance = new CheckBalance();
                if (checkBalance.checkAccount()) {
                    WithdrawMoney withdrawMoney = new WithdrawMoney();
                   if (withdrawMoney.checkMoneyATM());
                }




                break;
            case "2":  //Check balance

                break;
        }
        return ;
    }

}
