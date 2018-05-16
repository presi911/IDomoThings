/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idomothings;

import java.io.IOException;

/**
 *
 * @author david
 */
public class IDomoThings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
               Actuador dispositivo1=new Actuador("142-23", "calentador multiuso", "Calentador", "cocina", true);
       Sensor sensor1=new Sensor("143-1","sensor de temeperatura","temp 200","alcoba",true);
       
       dispositivo1.activar();
       sensor1.activar();
      
            
       
       Lista_dispositivos l=new Lista_dispositivos();
       l.Adcionar_dispostivo(dispositivo1);
      l.Adcionar_dispostivo(sensor1);
      
       l.Adcionar_dispostivo(new Actuador("142-24", "abrido de persianas",  "Persianas", "terraza", true));
       l.eliminar_dispositivo(dispositivo1);
    }
    
}
