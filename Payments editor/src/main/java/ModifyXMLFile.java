import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import javax.lang.model.element.Name;
//import javax.xml.crypto.Data;
import javax.xml.parsers.*;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
//import javax.xml.transform.Transformer;
//import javax.xml.transform.TransformerException;
//import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.omg.IOP.Encoding;
import org.w3c.dom.*;
//import org.w3c.dom.Element;
//import org.w3c.dom.NamedNodeMap;
//import org.w3c.dom.Node;
//import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ModifyXMLFile {

    public static void main(String args[]) {
        int numberDocumentNo = 1000;
        int documentDate = 20160713;
        String currentDatePayment = "13.07.16";

        int numberLine;
        Date date = new Date();
        String fullDate;
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mm:ss" + "000");
        fullDate = simpleDateFormat1.format(date) + "T" + simpleDateFormat2.format(date);
        System.out.println(fullDate);

        try {
            File filepath = new File("g:\\tmp\\Charitable help ALL.xml");
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(filepath);

            System.out.println(doc.getDocumentElement().getNodeName());
            doc.setXmlStandalone(true);

            NodeList temp = doc.getElementsByTagName("ROW");


            for (numberLine = 0; numberLine <= temp.getLength() - 1; numberLine++) {
                Node row = doc.getElementsByTagName("ROW").item(numberLine);
                NamedNodeMap attr = row.getAttributes();

                Node nodeAttrDocumentNo = attr.getNamedItem("DOCUMENTNO");
                Node nodeAttrDocumentDate = attr.getNamedItem("DOCUMENTDATE");
                Node nodeAttrDetailSofPayment = attr.getNamedItem("DETAILSOFPAYMENT");
                Node nodeStateId = attr.getNamedItem("STATEID");
                Node nodeStateName = attr.getNamedItem("StateName");
                Node nodeCreateDate = attr.getNamedItem("CREATEDATE");

                if (attr.getNamedItem("BOOKEDDATE") != null) {
                    attr.removeNamedItem("BOOKEDDATE");
                }
                if (attr.getNamedItem("DOCUMENTID") != null) {
                    attr.removeNamedItem("DOCUMENTID");
                }
                if (attr.getNamedItem("RECEIVEDATE") != null) {
                    attr.removeNamedItem("RECEIVEDATE");
                }
                if (attr.getNamedItem("USER1") != null) {
                    attr.removeNamedItem("USER1");
                }
                if (attr.getNamedItem("USER2") != null) {
                    attr.removeNamedItem("USER2");
                }

                nodeAttrDocumentNo.setTextContent(String.valueOf(numberLine + numberDocumentNo));
                nodeAttrDocumentDate.setTextContent(String.valueOf(documentDate));
                nodeStateId.setTextContent("1009");
                nodeStateName.setTextContent("На клиенте |Введен");
                nodeCreateDate.setTextContent(fullDate);


                String textDetailSofPayment = nodeAttrDetailSofPayment.getTextContent();
                String firstPartOfTheText = textDetailSofPayment.substring(0, 38);
                String secondPartOfTheText = textDetailSofPayment.substring(46, textDetailSofPayment.length() - 1);
                String insertingText = firstPartOfTheText + currentDatePayment + secondPartOfTheText;
                nodeAttrDetailSofPayment.setTextContent(insertingText);
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(String.valueOf(filepath)));
            transformer.setOutputProperty(OutputKeys.ENCODING, "windows-1251");
            transformer.transform(source, result);


            System.out.println("Done");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (SAXException sae) {
            sae.printStackTrace();
        }


    }
}
