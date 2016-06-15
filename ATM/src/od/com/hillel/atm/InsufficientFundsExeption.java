package od.com.hillel.atm;

public class InsufficientFundsExeption extends Exception {

    public InsufficientFundsExeption(String message) {
        super(message);
    }
}
