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
    static ArrayList<interface_dispositivo> lista_dispositivos = new ArrayList<interface_dispositivo>();
    write_json j=new write_json();
    
    
    public void Adcionar_dispostivo(interface_dispositivo dispositivo){
         lista_dispositivos.add(dispositivo);
         j.json(lista_dispositivos);
      
    }
    
    
    
    
    
    public void eliminar_dispositivo(interface_dispositivo dispositivo) throws IOException{
        lista_dispositivos.remove(dispositivo);
       j.json(lista_dispositivos);

    }
}
