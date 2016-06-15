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

    public int moneyATM;
    public int getMoneyATM;

    public int set_GetMoneyATM(int getMoneyATM, int moneyATM){
        this.getMoneyATM = getMoneyATM;
        this.moneyATM = moneyATM;
        return getMoneyATM;
    }

    public void chekMoneyOnAccount() {

    }

    public void chekMoheyInATM() throws InsufficientFundsExeption {    // 2.3.2.3. Проверка наличных в АТМ
        if (getMoneyATM > moneyATM) {
            throw new InsufficientFundsExeption("No money in ATM!");
        }
    }


}
