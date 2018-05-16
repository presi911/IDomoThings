/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Usuario;
import Modelo.ExcepcionUsuarioNoRegistrado;
import Modelo.IRepositorioUsuarios;

/**
 *
 * @author Lenovo
 */
public class ControlGestionarUsuarios implements IControlUsuario {

    IRepositorioUsuarios repositorioUsuarios;

    public ControlGestionarUsuarios(IRepositorioUsuarios repositorioUsuarios) {

        this.repositorioUsuarios = repositorioUsuarios;
    }
    
    @Override
    public void consultarUsuario(StringBuffer nusuario,
            StringBuffer contraseña, StringBuffer nombre, StringBuffer apellido) throws ExcepcionUsuarioNoRegistrado {

        Usuario usuario = repositorioUsuarios.consultarUsuario(nusuario.toString());
        contraseña.append(usuario.getContraseña());
        nombre.append(usuario.getNombre());
        apellido.append(usuario.getApellido());
    }

    @Override
    public void agregarUsuario(StringBuffer nusuario, StringBuffer contraseña, StringBuffer nombre, StringBuffer apellido) {
        repositorioUsuarios.agregarUsuario(nusuario.toString(), contraseña.toString(), nombre.toString(), apellido.toString());
       
    }

}
