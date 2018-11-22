package ejerciciosadattema1;

import ejemplos.Libreria;
import ejemplos.Libro;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import ejemplos.Librerias;
import javax.xml.bind.JAXBContext;
/**
 *
 * @author Canales-PC
 */
public class Actividad1_7 {
    private static final String MIARCHIVO_XML = "./libreria.xml";
    public static void main(String args[]) throws JAXBException, IOException {
        ArrayList<Libro> libroLista = new ArrayList<>();
	Libro libro1 = new Libro("*********", "******", "*******","******");
	libroLista.add(libro1);
	Libro libro2 = new Libro("**********", "*****", "********", "*****");
	libroLista.add(libro2);
	Libreria libreria1 = new Libreria();
	libreria1.setNombre("*****");
	libreria1.setLugar("********");
	libreria1.setListaLibro(libroLista);       
	ArrayList<Libro> libroLista2 = new ArrayList<>();
        Libro libro3 = new Libro("*****", "******", "******", "****");
        libroLista2.add(libro3);
        Libro libro4 = new Libro("*****", "******", "******", "****");
        libroLista2.add(libro4);
        Libro libro5 = new Libro("*****", "******", "******", "****");
        libroLista.add(libro5);
        Libreria libreria2 = new Libreria();
        libreria2.setNombre("****");
        libreria2.setLugar("*****");
        libreria2.setListaLibro(libroLista2);
        ArrayList<Libreria> Librerias = new ArrayList<>();
        Librerias.add(libreria1);
        Librerias.add(libreria2);
        Librerias milibreria = new Librerias();
        milibreria.setListaLibreria(Librerias);
        JAXBContext context = JAXBContext.newInstance(Librerias.class);
	Marshaller m = context.createMarshaller();
	m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	m.marshal(milibreria, System.out);
	m.marshal(milibreria, new File(MIARCHIVO_XML));
    }
}
