package od.com.hillel.atm;

public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();
        atm.setMoneyATM(200000);
        atm.setGetMoneyATM(3000);

        WithdrawMoney withdrawMoney = new WithdrawMoney();
        try {
            withdrawMoney.chekMoheyInATM();
        } catch (InsufficientFundsExeption insufficientFundsExeption) {
            System.out.println(insufficientFundsExeption.getMessage());
        }


    }
}
