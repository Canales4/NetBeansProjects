/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosadattema1;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import ejemplos.Departamentos;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
/**
 *
 * @author Canales-PC
 */
public class Actividad7 {
    public static void main(String args[])throws FileNotFoundException, IOException, ParserConfigurationException, TransformerConfigurationException, TransformerException{
        Departamentos departamento = null;
        File fichero = new File("Departamento.dat");
        FileInputStream fi = new FileInputStream(fichero);
        DataInputStream di = new DataInputStream(fi);
        int dep;
        String nombre, loc;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try{
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, "Departamentos", null);
            document.setXmlVersion("1.0");
            try{
                while(true){
                    dep = di.readInt();
                    nombre = di.readUTF();
                    loc = di.readUTF();
                    departamento = new Departamentos(dep,nombre,loc);
                    Element raiz = document.createElement("departamentos");
                    document.getDocumentElement().appendChild(raiz);
                    CrearElemento("dep", Integer.toString(departamento.getDep()), raiz, document);
                    CrearElemento("nombre", departamento.getNombre(), raiz, document);
                    CrearElemento("loc", departamento.getLoc(), raiz, document);
                }
            }catch(EOFException eof){
                System.out.println("fin lectura");
            }
            Source source = new DOMSource(document);
            Result result = new StreamResult(new java.io.File("Departamentos.xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
        }catch(ParserConfigurationException | DOMException e){
            e.printStackTrace();
        }
        di.close();
    }
    static void CrearElemento(String datoEmple, String valor, Element raiz, Document document){
        Element elem = document.createElement(datoEmple);
        Text text = document.createTextNode(valor);
        raiz.appendChild(elem);
        raiz.appendChild(text);
    }
}
