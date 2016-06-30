package od.com.hillel.atm;


import java.util.Date;

public class CheckBalance {
/*
    private int money;

    private void checkBalance(int money) {
        this.money = money;
    }
*/

    public boolean checkAccount() {
        return true;
    }


    public void printTicket(int money) {
        Date date = new Date();
        System.out.println("You have " + money + " money! Date is " + date);
    }


}
