package od.com.hillel.atm;

public class Person {
    private int id;
    private int pinCode;
    private String firstName;
    private String lastName;
    public int money;

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void initializedCard() {
        System.out.println();
    }


    public static class Visa extends Person {
        Visa(int id, int pinCode, String firstName, String lastName, int money) {
            setId(id);
            setPinCode(pinCode);
            setFirstName(firstName);
            setLastName(lastName);
            setMoney(money);
        }
    }

    public static class MasterCard extends Person {
        MasterCard(int id, int pinCode, String firstName, String lastName, int money) {
            setId(id);
            setPinCode(pinCode);
            setFirstName(firstName);
            setLastName(lastName);
            setMoney(money);
        }
    }
}



