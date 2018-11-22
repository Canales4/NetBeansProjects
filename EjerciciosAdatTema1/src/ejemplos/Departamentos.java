/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.io.Serializable;

/**
 *
 * @author Canales-PC
 */
public class Departamentos implements Serializable{
    private int dep;
    private String nombre;
    private String loc;

    public Departamentos(int dep, String nombre, String loc) {
        this.dep = dep;
        this.nombre = nombre;
        this.loc = loc;
    }

    public Departamentos() {
        this.nombre=null;
    }

    public int getDep() {
        return dep;
    }

    public void setDep(int dep) {
        this.dep = dep;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
    
}
