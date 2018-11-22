/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareainformesdi;

import java.awt.Desktop;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Canales-PC Copiado del tema 2 de internet 
 * Otro comentario por ALberto Lomas
 */
public class FacturasClientes {
        public static Connection conexion = null;
        String baseDatos = "jdbc:mysql://localhost/baseinforme";
        String usuario = "root";
        String clave = "";

    public FacturasClientes(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection(baseDatos,usuario,clave);
        }catch (ClassNotFoundException cnfe){
            System.err.println("Fallo al cargar JDBC");
            System.exit(1);
        }catch (SQLException sqle){
            System.err.println("No se pudo conectar a BD");
            System.exit(1);
        }catch (java.lang.InstantiationException sqlex){
            System.err.println("Imposible Conectar");
            System.exit(1);
        }catch (Exception ex){
            System.err.println("Imposible Conectar");
            System.exit(1);
        }
    }
     public void ejecutar(int cliente) {
        String archivojasper="./Actividad_Informe.jasper";
        try{
            Map parametros = new HashMap();
            parametros.put("cliente",cliente);
            JasperPrint print = JasperFillManager.fillReport(archivojasper, parametros, conexion);
            JasperExportManager.exportReportToPdfFile(print, "Informe_cliente.pdf");
            File path = new File ("Informe_cliente.pdf");
            Desktop.getDesktop().open(path);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString(),"Error",JOptionPane.WARNING_MESSAGE);
        }
    }
}

