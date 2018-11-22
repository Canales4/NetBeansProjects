package ejerciciosadattema1;
import java.io.*;
//@author Canales-PC
public class Actividad1_4 {
    //Metodo con lectura de fichero aleatorio el cual lee el registro cojiendo su id desde la linea de comandos
    //y modificando su salario sumando el segundo argumentos a la hora de ejecutarlo
    public static void main(String args[])throws IOException{
        File fich = new File("FichAle.dat");
        RandomAccessFile file = new RandomAccessFile(fich, "rw");
        int id = Integer.parseInt(args[0]);
        char apellido[] = new char[10], aux;
        Double salario = Double.parseDouble(args[1]);
        int pos = (id-1)*36;
        if(pos>= file.length()){
            System.out.println("NO EXISTE EL EMPLEADO CON ESE IDENTIFICADOR");
        }else{
            pos = pos+28;
            file.seek(pos);
            Double salarioantiguo = file.readDouble();
            salario = salarioantiguo+salario;
            file.seek(pos);
            file.writeDouble(salario);
            pos = (id-1)*36;
            pos = pos+4;
            file.seek(pos);
            for(int i=0;i<apellido.length;i++){
                aux = file.readChar();
                apellido[i] = aux;
            }
            String apellidos = new String(apellido);
            System.out.println("Apellido: "+apellidos+" \nSalario: "+salario+" \nSalario Antiguo: "+salarioantiguo);
        }
        file.close();
    }
}
