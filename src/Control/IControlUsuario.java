/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.ExcepcionUsuarioNoRegistrado;

/**
 *
 * @author Lenovo
 */
public interface IControlUsuario {
    
    public void consultarUsuario(StringBuffer nusuario,
            StringBuffer contraseña, StringBuffer nombre, StringBuffer apellido) throws ExcepcionUsuarioNoRegistrado;

    public void agregarUsuario(StringBuffer nusuario,
            StringBuffer contraseña, StringBuffer nombre, StringBuffer apellido);
}
