package ejemplos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*@author Canales-PC*/
public class LeerFichObject {
    public static void main(String args[])throws IOException, ClassNotFoundException{
        Persona persona;
        File fichero = new File("FichPersona.dat");
        FileInputStream filein = new FileInputStream(fichero);
        ObjectInputStream dataIS = new ObjectInputStream(filein);
        try{
            while(true){
                persona = (Persona) dataIS.readObject();
                System.out.printf("Nombre: %s, Edad: %d %n", persona.getNombre(), persona.getEdad());
            }
        }catch(EOFException eo){
            System.out.println("FIN DE LECTURA");
        }
        dataIS.close();
    }
}
