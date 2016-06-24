package od.com.hillel.atm;

/*  2.3.2. Если снятие нал.
2.3.2.1. Ввод суммы снятия
        2.3.2.1.1. 50грн
        2.3.2.1.2. 100грн
        2.3.2.1.3. 200грн
        2.3.2.1.4. 500грн
        2.3.2.1.5. Ввести сумму
        2.3.2.2. Проверка баланса счёта
        2.3.2.3. Проверка наличных в АТМ
        2.3.2.4. Обновление баланса на счету
        2.3.2.4.1. Печать квитанции
        2.3.2.4.1. Отобразить на экране
        2.3.2.5. Выдача наличных

        */
public class WithdrawMoney {
    public int totalMoneyATM;
    public int getMoneyATM;


    public int getMoneyATM(int getMoney) {
        int temp = totalMoneyATM - getMoney;
        return getMoney;
    }


    public void withdrawMoney(int getMoneyATM, int totalMoneyATM) {
        this.getMoneyATM = getMoneyATM;
        this.totalMoneyATM = totalMoneyATM;
    }

    public void checkMoneyOnAccount() {


    }

    public void checkMoneyInATM() throws InsufficientFundsException {    // 2.3.2.3. Проверка наличных в АТМ
        if (totalMoneyATM < getMoneyATM) {
            throw new InsufficientFundsException("No money in ATM!");
        }
    }


}
