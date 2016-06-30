package od.com.hillel.atm;

public class PersonFactory {
    int idCard;
    private void personFactory(int idCard) {
        this.idCard = idCard;
    }
    public Person identificationPerson(int idCard) {


        Person person = null;
        switch (idCard) {
            case 411900001:
                person = new Person.Visa(45661, 0001, "Ivanov", "Ivan", 12000);
                break;
            case 411900002:
                person = new Person.Visa(45601, 0002, "Petrov", "Ivan", 15000);
                break;
            case 411900003:
                person = new Person.Visa(45651, 0004, "Sidorov", "Petya", 8000);
                break;
            case 411900004:
                person = new Person.Visa(45001, 0003, "Ivanov", "Izya", 9000);
                break;
            case 548900001:
                person = new Person.MasterCard(49061, 1001, "Ivasin", "Jora", 12000);
                break;
            case 548900002:
                person = new Person.MasterCard(49062, 1002, "Petrovichin", "Yohan", 7000);
                break;
            default:
                System.out.println("Incorrect ID card!!");
                break;
        }
        return person;
    }

}
