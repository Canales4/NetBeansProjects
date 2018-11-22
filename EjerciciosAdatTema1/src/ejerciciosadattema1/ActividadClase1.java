package ejerciciosadattema1;
import java.io.*;
/*@author Canales-PC*/
public class ActividadClase1 { //AMPLIAR ACTIVIDAD CON METODOS Y QUE BORRE TODO
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dir = br.readLine();          //leemos directorio
        File[] f = new File(dir).listFiles();      //guardamos los archivos en un array
        for(int i=0;i<f.length;i++){               //recorremos la array
            if(f[i].isDirectory()){                //comprobamos si es dir
                String nuevodir = f[i].toString(); //amipliamos la ruta
                File[] f2 = new File(nuevodir).listFiles();//guardamos archivos en nueva array
                for(int j=0;j<f2.length;j++){//recorremos nueva array
                    f2[j].delete();//borramos todos archivos
                }
                f[i].delete();//borramos dir
            }else{
                f[i].delete();//si no es dir --> borramos archivos
            }
        }
    }
}
