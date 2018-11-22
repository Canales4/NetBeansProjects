package ejerciciosadattema1;

import ejemplos.Persona;
import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

/**
 *
 * @author Canales-PC
 */
public class Actividad1_5 {
    public static void main(String args[]) throws IOException{
        Persona persona;
        String nombre;
        int edad;
        File fichero = new File("FichPersona.dat");
        FileInputStream filein = new FileInputStream(fichero);
        ObjectInputStream dataIS = new ObjectInputStream(filein);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try{
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, "Personas", null);
            document.setXmlVersion("1.0");
            while(true){
                persona = (Persona) dataIS.readObject();
                nombre = persona.getNombre(); 
                edad = persona.getEdad();
                Element raiz = document.createElement("persona");
                document.getDocumentElement().appendChild(raiz);
                CrearElemento("nombre", nombre, raiz, document);
                CrearElemento("edad", Integer.toString(edad), raiz, document);
                Source source = new DOMSource(document);
                Result result = new StreamResult(new java.io.File("Personas.xml"));
                Transformer transformer = TransformerFactory.newInstance().newTransformer();
                transformer.transform(source, result);
            }
        }catch(Exception e){}
        dataIS.close();
    }
    
    static void CrearElemento(String datoEmple, String valor, Element raiz, Document document){
        Element elem = document.createElement(datoEmple);
        Text text = document.createTextNode(valor);
        raiz.appendChild(elem);
        raiz.appendChild(text);
    }
}
