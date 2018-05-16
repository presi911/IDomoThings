/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idomothings;

/**
 *
 * @author cristian
 */
public class Actuador  extends Dispositivo implements interface_dispositivo{
    public Actuador(String codigo, String serial, String nombre, String ubicacion, boolean visibilidad) {
        super(codigo, serial, nombre, ubicacion, visibilidad);
    }

    public double operacion(){
        if(isEstado())
            return 1;
        else 
            return 0;
    }
    
    
     @Override
    public String getDispositivo(){
        return String.format("%s,%s,%s,%s,%b,%b,%f",
             getCodigo(),getSerial(),getNombre(),getUbicacion(),isVisibilidad(),isEstado(),operacion());
        
        
      // return  String.format( "%s, %s, %b, %s, %s, %b ",super.toString());
    }
}
