/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Server {

    private int port = 0;
    private String name = "";
    private int id = 0;

    public Server(int port, String name) {
        this.port = port;
        this.name = name;
    }

    public void run() {
        ServerSocket server = null;
        Socket socket = null;
        Sensor client = null;
        boolean c = true;

        try {
            server = new ServerSocket(port);
            while (c) {

                socket = server.accept();
                id++;
                client = new Sensor(server, socket, name, id);

            }
            server.close();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
