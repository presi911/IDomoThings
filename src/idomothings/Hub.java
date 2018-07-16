/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idomothings;

import java.io.IOException;
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
    private LinkedList<Seccion>Secciones=new LinkedList<Seccion>();
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
        Seccion s2 = new Seccion("Alcoba", 1);
        Seccion s3 = new Seccion("Comedor", 1);
        Seccion s4 = new Seccion("Patio", 3);
        Seccion s5 = new Seccion("Sala", 4);
        Seccion s6 = new Seccion("Baño", 4);
        getSecciones().add(s1);
        getSecciones().add(s2);
        getSecciones().add(s3);
        getSecciones().add(s4);
        getSecciones().add(s5);
        getSecciones().add(s6);

    }
    
    public Seccion buscarSeccion(String nombre){
        Seccion s1=new Seccion();
        for(Seccion s:Secciones){
            if(nombre.equals(s.getNombre())){
                s1= s;
            }
        }
        return s1;
    }
    public void addDispositivo(Dispositivo d){
        for(Seccion s:getSecciones()){
            if(d.getUbicacion().equals(s.getNombre()))
                s.listar_Dispositivo(d);
        }
    }
    
    
    public void deleteDispositivo(Dispositivo d) throws IOException{
        for(Seccion s:getSecciones()){
            if(d.getUbicacion().equals(s.getNombre()))
                s.borrar_Dispositivo(d);
        }
    }
    public void activarDispsitivo(Dispositivo d){
        for(Seccion s:getSecciones()){
            if(d.getUbicacion().equals(s.getNombre()))
                d.activar();
           // s.listar_Dispositivo(d);
               // System.out.println("emtro al metodo activar");
        }
    
    }
    public void descativarDsipositivo(Dispositivo d){
        for(Seccion s:getSecciones()){
            if(d.getUbicacion().equals(s.getNombre()))
                d.desactivar();
           // s.listar_Dispositivo(d);
        }
    }
    public void ParametrizarDispositivo(Dispositivo d){
    for(Seccion s:getSecciones()){
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

    /**
     * @return the Secciones
     */
    public LinkedList<Seccion> getSecciones() {
        return Secciones;
    }

    /**
     * @param Secciones the Secciones to set
     */
    public void setSecciones(LinkedList<Seccion> Secciones) {
        this.Secciones = Secciones;
    }
}
