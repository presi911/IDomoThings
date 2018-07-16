/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idomothings;
import java.util.ArrayList;
import base_datos.write_json;
import java.io.IOException;
/**
 *
 * @author Carolina
 */
public class Lista_dispositivos {
    public static ArrayList<interface_dispositivo> lista_dispositivos = new ArrayList<interface_dispositivo>();
    //public static ArrayList<Dispositivo> DISPOSITIVOS = new ArrayList<Dispositivo>();
    /**
     * @return the lista_dispositivos
     */
    public static ArrayList<interface_dispositivo> getLista_dispositivos() {
        return lista_dispositivos;
    }

    /**
     * @param aLista_dispositivos the lista_dispositivos to set
     */
    public static void setLista_dispositivos(ArrayList<interface_dispositivo> aLista_dispositivos) {
        lista_dispositivos = aLista_dispositivos;
    }
    write_json j=new write_json();
    
    
    public void Adcionar_dispostivo(interface_dispositivo dispositivo){
         getLista_dispositivos().add(dispositivo);
         //DISPOSITIVOS.add(dispositivo);
         j.json(getLista_dispositivos());
      
    }
    
            
    
    
    
    
    public void eliminar_dispositivo(interface_dispositivo dispositivo) throws IOException{
       getLista_dispositivos().remove(dispositivo);
       j.json(getLista_dispositivos());

    }
}
