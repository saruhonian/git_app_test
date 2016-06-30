package od.com.hillel.atm;

public enum Money {

    FIFTY_GRYVIEN(50),
    ONE_HUNDRED_GRYVIEN(100),
    TWO_HUNDRED_GRYVIEN(200),
    FIVE_HUNDRED_GRYVIEN(500);

    private int nominal;

    Money(int nominal) {
        this.nominal = nominal;
    }

    public int getNominal() {
        return nominal;
    }
}
