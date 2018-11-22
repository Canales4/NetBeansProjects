package ejerciciosadattema2;

import java.sql.*;

/*@author Canales-PC*/
public class Actividad2_8 {
    public static void main(String args[]) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conexion = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Canales-PC\\Desktop\\ADAT\\Tema2\\SQLite\\ejemplo.db");
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            //Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","system");
            DatabaseMetaData dbmd = conexion.getMetaData();
            ResultSet resul = null;
            String nombre = dbmd.getDatabaseProductName();
            String driver = dbmd.getDriverName();
            String url = dbmd.getURL();
            String usuario = dbmd.getUserName();

            System.out.println("INFORMACION SOBRE LA BASE DE DATOS:");
            System.out.println("===================================");
            System.out.println("Nombre: "+nombre);
            System.out.println("Driver: "+driver);
            System.out.println("URL: "+url);
            System.out.println("Usuario: "+usuario);
            //Obtener informacion de las tablas y vistas que hay
            resul = dbmd.getTables(null, "ejemplo", null, null);
            while(resul.next()) {
                    String catalogo = resul.getString(1);
                    String esquema = resul.getString(2);
                    String tabla = resul.getString(3);
                    String tipo = resul.getString(4);
                    System.out.printf("%s - Catalogo: %s, Esquema: %s, Nombre: %s %n", tipo, catalogo, esquema, tabla);
            }
            conexion.close();
        }catch(ClassNotFoundException cne) {
                cne.printStackTrace();
        }catch(SQLException e) {
                e.printStackTrace();
        }
    }
}
