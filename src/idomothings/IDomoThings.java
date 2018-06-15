/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idomothings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author david
 */
public class IDomoThings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
               Actuador dispositivo1=new Actuador("142-23", "calentador multiuso", "Calentador", "cocina", true);
       Sensor sensor1=new Sensor("143-1","sensor de temeperatura","temp 200","alcoba",true);
       
       dispositivo1.activar();
       sensor1.activar();
      
            
       
       Lista_dispositivos l=new Lista_dispositivos();
       l.Adcionar_dispostivo(dispositivo1);
      l.Adcionar_dispostivo(sensor1);
      
       l.Adcionar_dispostivo(new Actuador("142-24", "abrido de persianas",  "Persianas", "terraza", true));
       l.eliminar_dispositivo(dispositivo1);
    
    String hostname = "127.0.0.1";
        int port = 6769;
        boolean flag = true;
        try (Socket socket = new Socket(hostname, port)) {
            InputStream input = socket.getInputStream();

                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);

                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                 writer.println("first");
            while (flag) {
                
                 writer.println("next");
                String line = reader.readLine();
                System.out.println(line);

               
            }

        } catch (UnknownHostException ex) {

            System.out.println("Server not found: " + ex.getMessage());

        } catch (IOException ex) {

            System.out.println("I/O error: " + ex.getMessage());
        }
}
}