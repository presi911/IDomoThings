/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegestion;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author cristian
 */
public class cargadorimagenes {
    
    public static BufferedImage obtenerImagen(String rutaImagen){//devuelve la imagen
    BufferedImage planet = null;
        try 
        {
            planet = ImageIO.read(new File(rutaImagen));//obtengo la ruta de laimagen desde cualquier parte
        }catch(IOException IO){
            System.out.println("motivo: " + IO.getLocalizedMessage());
        }
        return planet;//retorno la imagen
    
    
}
    
    
}
