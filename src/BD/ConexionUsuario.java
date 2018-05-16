package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author Lenovo
 */
public class ConexionUsuario {

    public Connection conectar() {
         String dbURL = "jdbc:derby://localhost:1527/iDomoThings";
        Connection conn = null;
       
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            //Get a connection
            conn = DriverManager.getConnection(dbURL);
              } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException except) {
            except.printStackTrace();
        }
          return conn;  

    }
    
    public Connection conectarBK() {
        String bd = "iDomoThings";
        String login = "root";
        String password = "admin";
        String url = "jdbc:mysql://localhost/" + bd;
        Connection conn = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conn = DriverManager.getConnection(url, login, password);

        } catch (SQLException ex) {
            System.out.println("Error " + url + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return conn;
    }

    public boolean consultarUsuario(StringBuffer usuario,
            StringBuffer contraseña, StringBuffer nombre, StringBuffer apellido) {

        Connection conn = conectar();
        String consulta = "SELECT * FROM Usuario WHERE usuario ='" + usuario + "'";
        try {
            try (Statement sentencia = conn.createStatement()) {

                ResultSet rs = sentencia.executeQuery(consulta);

                if (rs != null) {
                    rs.next() ;
                    usuario.append(rs.getString("usuario"));
                    contraseña.append(rs.getString("contraseña"));
                    nombre.append(rs.getString("nombre"));
                    apellido.append(rs.getString("apellido"));
                    conn.close();
                    return true;
                }

            }
            conn.close();

        } catch (SQLException ex) {
            return false;
        }


        return false;



    }}