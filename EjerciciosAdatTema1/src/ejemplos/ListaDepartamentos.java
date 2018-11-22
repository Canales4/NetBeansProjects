/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.ArrayList;

/**
 *
 * @author Canales-PC
 */
public class ListaDepartamentos {
    public ArrayList<Departamentos> listadepartamentos;
    public Departamentos dep;

    public ListaDepartamentos(Departamentos dep) {
        this.dep = dep;
    }
    public ListaDepartamentos(){
        
    }

    public ListaDepartamentos(ArrayList<Departamentos> listadepartamentos) {
        super();
        this.listadepartamentos = listadepartamentos;
    }

    public ArrayList<Departamentos> getListadepartamentos() {
        return listadepartamentos;
    }

    public void setListadepartamentos(ArrayList<Departamentos> listadepartamentos) {
        this.listadepartamentos = listadepartamentos;
    }
    
}
