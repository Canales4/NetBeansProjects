/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareainformesdi;
import javax.swing.JOptionPane;
/**
 *
 * @author Canales-PC
 */
public class TareaInformesDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FacturasClientes  fc=new  FacturasClientes();
        Integer  cliente= Integer.valueOf(JOptionPane.showInputDialog("Introduce el  id  de  cliente  del  quequieres  generar  el  informe"));
        fc.ejecutar(cliente);
    }
}
