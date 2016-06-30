package od.com.hillel.atm;
/*
2.1. Card
	2.1.1. Accaunt
	2.2. проверка пина банком
	2.3. Выбор функции (снятие/ проверка счёта)
 */


import java.util.Scanner;

public class ATM {
    int idCard = 0;
    //public int totalMoneyATM = 200000;
    private static ATM instance = null;


    public static ATM getInstance() {
        if (ATM.instance == null) {
            ATM.instance = new ATM();
        }
        return ATM.instance;
    }

    public void insertCard() throws InsufficientFundsException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter yor ID card: ");
        int idCard = scanner.nextInt();
        PersonFactory personFactory = new PersonFactory();
        Person person = personFactory.identificationPerson(idCard);
       MainMenuATM mainMenuATM = MainMenuATM.getInstance(person);
        mainMenuATM.chooseFunction();
    }
/*
    public void setMoneyATM(int moneyATM) {
        this.totalMoneyATM = moneyATM;
    }
*/
}
