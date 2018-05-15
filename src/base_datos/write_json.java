/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base_datos;
import idomothings.Lista_dispositivos;
import idomothings.interface_dispositivo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import java.util.Iterator;


/**
 *
 * @author Carolina
 */
public class write_json {
    public void json(ArrayList<idomothings.interface_dispositivo> l) {
        JSONArray obj = new JSONArray();
        JSONObject hub = new JSONObject();
        JSONArray sensores = new JSONArray();
         for (int i = 0; i < l.size(); i++) {
            JSONArray list = new JSONArray();
            String[] c;
            c = l.get(i).getDispositivo().split(",");
            list.add(c[1]);
            list.add(c[2]);
            list.add(c[3]);
            list.add(c[4]);
            list.add(c[5]);
            list.add(c[6]);
            JSONObject sensor = new JSONObject();
            sensor.put(c[0], list);
            sensores.add(sensor);
        }
        hub.put("casa1", sensores);
        obj.add(hub);
        
        try {
            FileWriter file = new FileWriter("p.json");
            file.write(obj.toJSONString());
            file.flush();
            file.close();
        }catch (IOException e) {
            //manejar error
            System.out.println("no creo el json");
        }
        System.out.println(obj);
    }

}
