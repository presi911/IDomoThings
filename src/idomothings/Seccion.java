/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idomothings;

import java.io.IOException;

/**
 *
 * @author cristian
 */
public class Seccion {
    private String nombre;
    private int tope_dispositivo;
    private Lista_dispositivos lista;
    private int numdisp;
    public Seccion() {
    }

    public Seccion(String nombre, int tope_dispositivo) {
        this.nombre = nombre;
        this.tope_dispositivo = tope_dispositivo;
        this.lista=new Lista_dispositivos();
        numdisp=0;
    }
    
    
    public void listar_Dispositivo(Dispositivo d){
        try {
             if (numdisp < tope_dispositivo) {
                getLista().Adcionar_dispostivo(d);
            numdisp += 1;
        }
        } catch (Exception e) {
            System.out.println("Esta seccion no puede contener mas dispositivos");
        }
       
        
    }
    public void borrar_Dispositivo(Dispositivo d) throws IOException{
        getLista().eliminar_dispositivo(d);
        numdisp=numdisp-1;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the tope_dispositivo
     */
    public int getTope_dispositivo() {
        return tope_dispositivo;
    }

    /**
     * @param tope_dispositivo the tope_dispositivo to set
     */
    public void setTope_dispositivo(int tope_dispositivo) {
        this.tope_dispositivo = tope_dispositivo;
    }

    /**
     * @return the lista
     */
    public Lista_dispositivos getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(Lista_dispositivos lista) {
        this.lista = lista;
    }
}
