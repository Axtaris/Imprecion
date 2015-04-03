
package com.printing.helpers;

import com.printing.modelo.porPeso;
import com.printing.modelo.porLongitud;
import com.printing.modelo.generalImprecion;

/**
 *
 * @author Diego
 */
public class CargarConfig {
    GestionDeconfiguracion configuracion;
    porPeso peso;
    porLongitud longitud;
    generalImprecion Kwh;
    
    public CargarConfig() {
        
    }
    
    public void Cargar2()
    {
        configuracion = new GestionDeconfiguracion();
        peso = new porPeso();
        longitud = new porLongitud();
        Kwh = new generalImprecion();
        
        double x = Double.parseDouble(configuracion.getConfiguraciones().getProperty("valor_kilo_filamento_ABS"));
               x = x / 1000;
        double z = x / 360;
        peso.setPrecioGrExtruidoABS(x);
        longitud.setPrecioMmExtruidoABS(z);
                
        double a = Double.parseDouble(configuracion.getConfiguraciones().getProperty("valor_kilo_filamento_PLA"));
               a = a / 1000;
        double b = a / 360;  
        peso.setPrecioGrExtruidoPLA(a);
        longitud.setPrecioMmExtruidoPLA(b);
        
       Kwh.setValorKwh(Double.parseDouble(configuracion.getConfiguraciones().getProperty("valor_KWH")));
       System.err.println("ok");
    }  
}
