/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;
import BD.ConexionUsuario;
import Modelo.ExcepcionUsuarioNoRegistrado;
import Modelo.Usuario;
import Modelo.IRepositorioUsuarios;
/**
 *
 * @author Lenovo
 */
public class RepositorioReal implements IRepositorioUsuarios {
    
    private ConexionUsuario conexion = new ConexionUsuario();

    @Override
    public Usuario consultarUsuario(String cedula) throws ExcepcionUsuarioNoRegistrado {
        StringBuffer usuario = new StringBuffer(),
                contraseña = new StringBuffer(),
                nombre = new StringBuffer(),
                apellido = new StringBuffer();
        

        
         if(conexion.consultarUsuario(usuario, contraseña, nombre,apellido))
             
             return new Usuario(usuario.toString(), contraseña.toString(), nombre.toString(),apellido.toString());
        
        throw new ExcepcionUsuarioNoRegistrado(usuario+"\tNo está en la lista de usuarios");
        
        
    }

    @Override
    public void agregarUsuario(String nomUsuario, String contraseña, String nombre, String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
