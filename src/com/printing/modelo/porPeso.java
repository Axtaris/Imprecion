
package com.printing.modelo;

/**
 *
 * @author Diego
 */
public class porPeso extends generalImprecion{
    
    private double peso;
    static private double precioGrExtruidoABS;
    static private double precioGrExtruidoPLA;

    public porPeso() {
    }

    public porPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecioGrExtruidoABS() {
        return precioGrExtruidoABS;
    }

    public void setPrecioGrExtruidoABS(double precioGrExtruidoABS) {
        this.precioGrExtruidoABS = precioGrExtruidoABS;
    }

    public double getPrecioGrExtruidoPLA() {
        return precioGrExtruidoPLA;
    }

    public void setPrecioGrExtruidoPLA(double precioGrExtruidoPLA) {
        this.precioGrExtruidoPLA = precioGrExtruidoPLA;
    }
 
    public double calcularPrecioPorPeso()
    {
        if("PLA".equals(getTipoMaterial()))
        {    
            double x = peso * precioGrExtruidoPLA;

            return x;
        }
        if("ABS".equals(getTipoMaterial()))
        {
           double x = peso * precioGrExtruidoABS;

           return x; 
        }
        return -1;
    }
    
     public double calcularValorDesperdicio()
    {
        if ("ABS".equals(getTipoMaterial()))
        {
            double x = getDesperdicio() * precioGrExtruidoABS; 
            
            return x;
        }
        if ("PLA".equals(getTipoMaterial()))
        {
            double y = getDesperdicio() * precioGrExtruidoABS; 
            
            return y;
        }
        return -1;   
    }
     
    @Override
     public String toString()
     {
        double x;
        x = calcularPrecioPorPeso() + calcularPrecioElectricidad() + calcularValorDesperdicio();
        
        return "Valor De La pieza" + " " + x;
     }
}
