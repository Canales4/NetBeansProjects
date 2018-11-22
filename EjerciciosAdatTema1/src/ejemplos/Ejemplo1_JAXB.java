package ejemplos;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
/**
 *
 * @author Canales-PC
 */
public class Ejemplo1_JAXB {
    private static final String MIARCHIVO_XML = "./libreria.xml";
	public static void main(String args[]) throws JAXBException, IOException {
		ArrayList<Libro> libroLista = new ArrayList<Libro>(); //array de libros
                ArrayList<Libreria> listaLibrerias = new ArrayList<Libreria>();//array de librerias
		Libro libro1 = new Libro("Entornos de Desarrollo", "Alicia Ramos", "Garceta","978-84-1545-297-3");//libro
		libroLista.add(libro1);//añadimos libro al array
		Libro libro2 = new Libro("Acceso a Datos", "Maria Jesus Ramos", "Garceta", "978-48-1545-228-7");
		libroLista.add(libro2);
		Libreria milibreria = new Libreria();//creamos una libreria
                Librerias mislibrerias = new Librerias();//creamos una mislibrerias
		milibreria.setNombre("Prueba de libreria JAXB");//damos nombre
		milibreria.setLugar("Talvera, como no");//y lugar
		milibreria.setListaLibro(libroLista);//añadimos lista de libros a la libreria
                listaLibrerias.add(milibreria);
                mislibrerias.setListaLibreria(listaLibrerias);
		JAXBContext context = JAXBContext.newInstance(Librerias.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(milibreria, System.out);//cambiarlo
		m.marshal(milibreria, new File(MIARCHIVO_XML));//cambiarlo
		System.out.println("---------Leo el XML----------");
		Unmarshaller unmars = context.createUnmarshaller();
		Libreria libreria2 = (Libreria) unmars.unmarshal(new FileReader(MIARCHIVO_XML));
		System.out.println("Nombre de la libreria: "+libreria2.getNombre());//sacamos la lista
		System.out.println("Lugar de la libreria: "+libreria2.getLugar());
		System.out.println("Libros de la libreria");
	}
}
