import javax.naming.spi.DirectoryManager;
import java.io.File;

public class Tmp {
    public static void main(String[] args) {
        String file = new File(".").getAbsolutePath();
        File file2 = new File("Charitable help ALL new.xml").getAbsoluteFile();

        System.out.println("File: " + file);
        System.out.println("File2: " + file2);
    }
}
