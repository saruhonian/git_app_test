package od.com.hillel.atm;
/*
2.1. Card
	2.1.1. Accaunt
	2.2. проверка пина банком
	2.3. Выбор функции (снятие/ проверка счёта)
 */

public class ATM {
    public int moneyATM;
    public int getMoneyATM;

    private final static int FIFTY_GRYVIEN = 50;
    private final static int ONE_HUNDRED_GRYVIEN = 100;
    private final static int TWO_HUNDRED_GRYVIEN = 200;
    private final static int FIVE_HUNDRED_GRYVIEN = 500;

    public int getMoneyATM() {
        return moneyATM;
    }

    public void setMoneyATM(int moneyATM) {
        this.moneyATM = moneyATM;
    }

    public int getGetMoneyATM() {
        return getMoneyATM;
    }

    public void setGetMoneyATM(int getMoneyATM) {
        this.getMoneyATM = getMoneyATM;
    }



}
