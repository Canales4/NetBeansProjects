package ejerciciosadattema1;
import java.io.*;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

/*@author Canales-PC*/
public class Actividad1_6 {
    public static void main(String args[])throws FileNotFoundException, IOException, SAXException{
        XMLReader procesadorXML = XMLReaderFactory.createXMLReader();
        GestionContenido gestor = new GestionContenido();
        procesadorXML.setContentHandler(gestor);
        InputSource fileXML = new InputSource("Empleados.xml");
        procesadorXML.parse(fileXML);
    }
}

class GestionContenido extends DefaultHandler {
    public GestionContenido(){
        super();
    }
    public void startDocument(){
        System.out.println("Comienzo del Documento XML");
    }
    public void endDocument(){
        System.out.println("Final del Documento XML");
    }
    public void startElement(String uri, String nombre, String nombreC, Attributes atts){
        System.out.printf("\tPrincipio Elemento: %s %n", nombre);
    }
    public void characters(char[] ch, int inicio, int longitud)throws SAXException{
        String car = new String(ch, inicio, longitud);
        car = car.replaceAll("[\t\n]", "");
        System.out.printf("\tCaracteres: %s %n", car);
    }
}
