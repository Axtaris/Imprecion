/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.printing.helpers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author fcapote
 */

public class GestionDeconfiguracion implements Serializable{
   

    private Properties configuraciones;
    


    public GestionDeconfiguracion()  {
        try {
            configuraciones = new Properties();
                        Cargar();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionDeconfiguracion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionDeconfiguracion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void explorarPropiedades() {
        for (Enumeration e = configuraciones.keys(); e.hasMoreElements();) {
            Object obj = e.nextElement();
            System.out.println(obj + ": " + configuraciones.getProperty(obj.toString()));
        }
    }


    public boolean grabar(String vkf_abs,String vkf_pla, String vkwh) {
        FileOutputStream os = null;
        try {
            configuraciones.setProperty("valor_kilo_filamento_ABS", vkf_abs);
            configuraciones.setProperty("valor_kilo_filamento_PLA", vkf_pla);
            configuraciones.setProperty("valor_KWH", vkwh);
            
            String  url=this.getClass().getResource(("/com/printing/recursos/configuraciones.properties")).toString();
            
            os = new FileOutputStream(url.substring(url.indexOf(":/")+2, url.length()));
            configuraciones.store(os, null);
            
            return true;
           
        } catch (IOException ioe) {            
           return false;
        } catch (Exception e) {
           return false;
        }
    }

    public void Cargar() throws FileNotFoundException, IOException {
       

        InputStream is_conf =this.getClass().getResourceAsStream("/com/printing/recursos/configuraciones.properties");
                   
        configuraciones.load(is_conf); 
              
    }

    public Properties getConfiguraciones() {
        return configuraciones;
    }

    public void setConfiguraciones(Properties configuraciones) {
        this.configuraciones = configuraciones;
    }

   

   
}