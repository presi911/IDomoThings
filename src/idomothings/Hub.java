/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idomothings;

import java.util.LinkedList;

/**
 *
 * @author cristian
 */
public class Hub {
     private String direccion;
    private double Metros;
    private String propietario;
    private String Sector;
    LinkedList<Seccion>Secciones=new LinkedList<Seccion>();
    public Hub() {
    }

    public Hub(String direccion, double Metros, String propietario, String Sector) {
        this.direccion = direccion;
        this.Metros = Metros;
        this.propietario = propietario;
        this.Sector = Sector;
    }

    public void addSeccion() {
        Seccion s1 = new Seccion("Cocina", 2);
        Seccion s2 = new Seccion("Alcoba1", 1);
        Seccion s3 = new Seccion("Alcoba2", 1);
        Seccion s4 = new Seccion("Terraza", 3);
        Seccion s5 = new Seccion("Sala", 4);
        Secciones.add(s1);
        Secciones.add(s2);
        Secciones.add(s3);
        Secciones.add(s4);
        Secciones.add(s5);
        

    }
    public void addDispositivo(Dispositivo d){
        for(Seccion s:Secciones){
            if(d.getUbicacion().equals(s.getNombre()))
                s.listar_Dispositivo(d);
        }
    }
    
    
    public void deleteDispositivo(Dispositivo d){
        for(Seccion s:Secciones){
            if(d.getUbicacion().equals(s.getNombre()))
                s.listar_Dispositivo(d);
        }
    }
    public void activarDispsitivo(Dispositivo d){
        for(Seccion s:Secciones){
            if(d.getUbicacion().equals(s.getNombre()))
                d.activar();
           // s.listar_Dispositivo(d);
               // System.out.println("emtro al metodo activar");
        }
    
    }
    public void descativarDsipositivo(Dispositivo d){
        for(Seccion s:Secciones){
            if(d.getUbicacion().equals(s.getNombre()))
                d.desactivar();
           // s.listar_Dispositivo(d);
        }
    }
    public void ParametrizarDispositivo(Dispositivo d){
    for(Seccion s:Secciones){
            if(d.getUbicacion().equals(s.getNombre()))
                d.parametrizar();
           // s.listar_Dispositivo(d);
        }
    
    }
    
    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @return the Metros
     */
    public double getMetros() {
        return Metros;
    }

    /**
     * @return the propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @return the Sector
     */
    public String getSector() {
        return Sector;
    }
}
