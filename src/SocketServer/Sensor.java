/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.*;

/**
 *
 * @author dericop
 */
public class Sensor implements Runnable {

    private Thread thread = null;
    private ServerSocket server = null;
    private Socket socket = null;
    private PrintWriter out = null;
    private BufferedReader in = null;
    private String name = "";
    private int id = 0;

    public Sensor(ServerSocket aServerSocket, Socket aSocket, String name, int id) throws InterruptedException {
        this.socket = aSocket;
        this.server = aServerSocket;
        this.name = name;
        this.id = id;

        try {
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        thread = new Thread(this);
       // Thread.sleep(4000); 
        thread.start();
         
        
        
    }

    public void close() {
        try {
            out.close();
            in.close();
            socket.close();
            
            //server.close();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int temperatura(){
    int medida2 = (int) (Math.random()*100+1);
    //System.out.println("El número aleatorio entre 1 y 25 es: " + medida2);
        return medida2;
    }
    

    @Override
    public void run() {
        String readLine = "";
        SimpleDateFormat df = null;
        out.println(name);
        out.println("Session ID: " + id);

        System.out.println(name);
        System.out.println("Session ID: " + id);
        readLine = "";
        JSONObject json = new JSONObject();
        int limiteinicial = 0, limitefinal = 0;
        String medida = "";
        temperatura();
     
        while (!readLine.trim().equalsIgnoreCase("QUIT")) {
            try {
            readLine = in.readLine();
        } catch (Exception e) {
            System.out.println(e);
        }
            if (readLine.trim().equals("TEMP")) {
                limiteinicial = 10;
                limitefinal = 40;
                medida = "C";
            } else if (readLine.trim().equals("HUM")) {
                limiteinicial = 10;
                limitefinal = 100;
                medida = "%";
            } else if (!readLine.trim().equals("QUIT")) {
                out.println("Informacion Sensor");
            }

            df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String datetime = df.format(new Date());
            int valor = (int) Math.floor(Math.random() * (limiteinicial - (limitefinal + 1)) + (limitefinal));
            try { 
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Sensor.class.getName()).log(Level.SEVERE, null, ex);
            }
            json.put("valor", valor);
            json.put("medida", temperatura());
            json.put("fecha de la toma", datetime);

            try {
                OutputStreamWriter outs = new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8);
                outs.write(json.toString());
                out.println(json.toString());
            } catch (Exception e) {
            }
            try {
                readLine = in.readLine();
            } catch (Exception e) {
                System.out.println(e);
            }

        }

        close();

    }

}
