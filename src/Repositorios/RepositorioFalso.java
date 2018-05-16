/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import Modelo.IRepositorioUsuarios;
import Modelo.Usuario;
import java.util.ArrayList;
import Modelo.ExcepcionUsuarioNoRegistrado;


/**
 *
 * @author Lenovo
 */
public class RepositorioFalso implements IRepositorioUsuarios {

    public ArrayList<Usuario> usuarios = new ArrayList<>();

    public RepositorioFalso() {
        usuarios.add(new Usuario("user1", "1234", "Tatiana", "Sánchez"));
        usuarios.add(new Usuario("user2", "123", "Juan David", "Moreno"));
        usuarios.add(new Usuario("user3", "12345", "Victor", "Estupiñán"));
        usuarios.add(new Usuario("user4", "123456", "Francisco", "Aristizábal"));
        
    }

    @Override
    public Usuario consultarUsuario(String nomUsuario) throws ExcepcionUsuarioNoRegistrado {
        for (Usuario usuario:usuarios)
        {
            if(usuario.getNombreUsuario().equals(nomUsuario))
                return usuario;
        }
        throw new ExcepcionUsuarioNoRegistrado(nomUsuario+"\tNo está en la lista de usuarios");
    }

    @Override
    public void agregarUsuario(String nomUsuario, String contraseña, String nombre, String apellido) {
        usuarios.add(new Usuario(nomUsuario, contraseña, nombre, apellido));
    }
}
