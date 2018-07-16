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
public class Sensor extends Dispositivo{
    public Sensor(String nombre, String serial,String codigo, String ubicacion, boolean visibilidad) {
        super(nombre, serial, codigo, ubicacion, visibilidad);
    }
    public double valor(){
        if(isEstado())
            return (Math.random()*100+1);
        else
            return 10;
    }
    
    
    @Override
    public String getDispositivo(){
       return String.format("%s,%s,%s,%s,%b,%b,%f",
             getCodigo(),getSerial(),getNombre(),getUbicacion(),isVisibilidad(),isEstado(),valor());
    }
}
