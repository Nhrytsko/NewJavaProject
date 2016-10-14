package nhrytsko;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;


public class WorkingWithXMLs {

    public void ParseXML(){
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            DocumentBuilder builder = factory.newDocumentBuilder();

            Document doc = builder.parse("http://feeds.reuters.com/reuters/environment");

            NodeList list = doc.getElementsByTagName("title");

            int a= list.getLength();

            System.out.println("There are " + a + " items");

            for (int i = 0; i< list.getLength(); i++){
                Element item = (Element) list.item(i);
                System.out.println(item.getFirstChild().getNodeName());
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
