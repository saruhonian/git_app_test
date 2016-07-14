import java.io.*;

public class Main {
    private static String lastName;
    private static String firstName;
    private static int age;

    public Main(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public static void main(String[] args) {
        writeATxtFile();
    }

    public static void writeAXmlFile() {

    }

    public static void readFile() {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;


        try {
            fileReader = new FileReader("d:\\java_inout\\students.txt");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeATxtFile() {
        FileWriter fileWriter = null;
        BufferedWriter writer = null;

        Student student1 = new Student("Petrova", "Irina", 35);
        Student student2 = new Student("Ivanova", "Galya", 25);
        Student student3 = new Student("Sidorova", "Marusya", 30);

        try {
            fileWriter = new FileWriter("d:\\java_inout\\students.txt");
            writer = new BufferedWriter(fileWriter);
            writer.write("Lastname: " + student1.lastName + "\r\n"
                    + "Firstname: " + student1.firstName + "\r\n"
                    + "Age: " + student1.age + "\r\n");
            writer.newLine();
            writer.write("Lastname: " + student2.lastName + "\r\n"
                    + "Firstname: " + student2.firstName + "\r\n"
                    + "Age: " + student2.age + "\r\n");
            writer.newLine();
            writer.write("Lastname: " + student3.lastName + "\r\n"
                    + "Firstname: " + student3.firstName + "\r\n"
                    + "Age: " + student3.age + "\r\n");

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
