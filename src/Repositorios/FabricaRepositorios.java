/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import Modelo.IRepositorioUsuarios;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class FabricaRepositorios {

    public static IRepositorioUsuarios getRepositorioUsuarios() {
        Properties prop = new Properties();
        try {

            FileInputStream archivo =
                    new FileInputStream("../iDomoThings/src/repositorios/Propiedades.properties");
            prop.load(archivo);

            String repositorio = prop.getProperty("repositorio");
            switch (repositorio) {
                case "Sql":
                    return new RepositorioReal();
                case "Falso":
                    return new RepositorioFalso();
            }

        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
        return null;
    }
}
