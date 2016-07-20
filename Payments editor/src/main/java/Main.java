import javax.swing.text.Document;
import javax.xml.soap.Node;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("g:\\tmp\\Fixed1.xml");
        BufferedReader reader = new BufferedReader(fileReader);
       // Document doc = docBuilder.parse(fileReader);




        String line;
        while ((line = reader.readLine()) != null) {
            String strLin = String.valueOf(line.equals("DOCUMENTNO"));
    //        Node row = line.getElementByTagName("row").item(0);

            System.out.println(line);
            System.out.println(strLin);

           // Node valueDocumentNo = nodes.item(idx).getAttributes().getNamedItem("value");
            // String[] arr = line.split("");
           // System.out.println(Arrays.toString(arr));

        }
    }
}
