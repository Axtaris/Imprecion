
package com.printing.modelo;


public class porLongitud extends  materialSoporte{
    
    private double logitud;
    static private double precioMmExtruidoPLA;
    static private double precioMmExtruidoABS;

    public porLongitud() {
    }
         
    public porLongitud(double logitud) {
        this.logitud = logitud;
    }
   
    public double getLogitud() {
        return logitud;
    }

    public void setLogitud(double logitud) {
        this.logitud = logitud;
    }

    public double getPrecioMmExtruidoPLA() {
        return precioMmExtruidoPLA;
    }

    public void setPrecioMmExtruidoPLA(double precioMmExtruidoPLA) {
        this.precioMmExtruidoPLA = precioMmExtruidoPLA;
    }

    public double getPrecioMmExtruidoABS() {
        return precioMmExtruidoABS;
    }

    public void setPrecioMmExtruidoABS(double precioMmExtruidoABS) {
        this.precioMmExtruidoABS = precioMmExtruidoABS;
    }
    
    public double calcularPrecioPorLongitud()
    {
        if ("PLA".equals(getTipoMaterial())){
            double x = precioMmExtruidoPLA * logitud;

            return x;
            }
        if ("ABS".equals(getTipoMaterial())){
            double x = precioMmExtruidoABS * logitud;

            return x;
        }
        return -1;
    }
     @Override
     public String toString()
     {
        double x = 0;
        
        if (isUsoSoporte() == false)
        {
            x = calcularPrecioPorLongitud() + calcularPrecioElectricidad() + calcularValorDesperdicio();
        }
        if (isUsoSoporte() == true)
        {
            x = calcularPrecioPorLongitud() + calcularPrecioElectricidad() + calcularValorDesperdicio() + calcularCostoMaterialSoporte();
        }
        return "Valor De La pieza" + x;
     }
    

}
