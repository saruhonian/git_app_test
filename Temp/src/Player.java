import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);

    String lastname = scanner.next();
    String firstname = scanner.next();
    String middlename = scanner.next();
    int age = scanner.nextInt();
    String sex = scanner.next();

    public Player(String lastname, String firstname, String middlename, int age, String sex) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.middlename = middlename;
        this.age = age;
        this.sex = sex;
/*
        System.out.println("Enter lastname: ");
        lastname = scanner.next();
        System.out.println("Enter firstname: ");
        firstname = scanner.next();
        System.out.println("Enter middlename: ");
        middlename = scanner.next();
        System.out.println("Enter age: ");
        age = scanner.nextInt();
        System.out.println("Enter sex: ");
        sex = scanner.next();

*/

    }
    public void prt() {
        System.out.println();
    }

}
