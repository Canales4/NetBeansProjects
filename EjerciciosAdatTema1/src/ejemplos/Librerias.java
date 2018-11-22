/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Canales-PC
 */
@XmlRootElement(name="MISLIBRERIAS")
public class Librerias {
    private ArrayList<Libreria> listaLibrerias;
    public Librerias(ArrayList<Libreria> listasLibrerias){
        super();
        this.listaLibrerias=listasLibrerias;
    }
    public Librerias(){}
    
    @XmlElement(name="Libreria")
    public ArrayList<Libreria> getListaLibrerias(){
        return listaLibrerias;
    }
    public void setListaLibreria(ArrayList<Libreria> listaLibrerias){
        this.listaLibrerias=listaLibrerias;
    }
}
