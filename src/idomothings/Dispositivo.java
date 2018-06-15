/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idomothings;

import javax.swing.JOptionPane;
/**
 *
 * @author cristian
 */
public class Dispositivo implements interface_dispositivo {
    private String nombre;
    private String serial;
    private boolean estado;
    private String codigo;
    private String ubicacion;
    private boolean visibilidad;
    private double valor;

    public Dispositivo( String codigo, String serial, String nombre, String ubicacion, boolean visibilidad) {
         this.codigo = codigo;
        this.serial = serial;
        this.estado = false;
        this.nombre=nombre;
        this.ubicacion = ubicacion;
        this.visibilidad = visibilidad;
        this.valor=0;
       
    }
    
   
    

    
    
    
    
    //METODOS ABTRACTOS

    @Override
    public void activar() {
        try {
            if(!estado)
           setEstado(true);
        } catch (Exception e) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
        }
       
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

                
    }

    @Override
    public void desactivar() {
        try {
            if(estado)
           setEstado(false);
        } catch (Exception e) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
        }
    }

    @Override
    public void parametrizar() {
        setNombre(JOptionPane.showInputDialog("Digite nuevo nombre de dispostivo"));
        if(visibilidad)
             setVisibilidad(false);
        else
            setVisibilidad(true);
        }

    @Override
    public String getDispositivo() {
        return String.format("%s, %s,%s, %s, %b,%b,%f",
                getCodigo(),getSerial(),getNombre(),getUbicacion(),isVisibilidad(),isEstado(),getValor());
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the serial
     */
    public String getSerial() {
        return serial;
    }

    /**
     * @param serial the serial to set
     */
    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * @return the estado
     */
   

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return the visibilidad
     */
    public boolean isVisibilidad() {
        return visibilidad;
    }

    /**
     * @param visibilidad the visibilidad to set
     */
    public void setVisibilidad(boolean visibilidad) {
        this.visibilidad = visibilidad;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
}
