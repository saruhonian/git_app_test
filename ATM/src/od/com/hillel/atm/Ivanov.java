package od.com.hillel.atm;

public class Ivanov extends Person{
    Ivanov(int id, String firstName, String lastName, int money) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setMoney(money);
    }

    public void initializedCard() {
        System.out.println("Initialized.... this is Ivanova Ivana");
    }
}
