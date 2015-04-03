
package com.printing.modelo;

/**
 *
 * @author Diego
 */
public class materialSoporte extends porPeso{
    
    private String tipoMaterialSoprote;
    static private double pesoGrMaterialSoporte;

    public materialSoporte() {
    }

    public String getTipoMaterialSoprote() {
        return tipoMaterialSoprote;
    }

    public void setTipoMaterialSoprote(String tipoMaterialSoprote) {
        this.tipoMaterialSoprote = tipoMaterialSoprote;
    }

    public double getPesoGrMaterialSoporte() {
        return pesoGrMaterialSoporte;
    }

    public void setPesoGrMaterialSoporte(double pesoGrMaterialSoporte) {
        this.pesoGrMaterialSoporte = pesoGrMaterialSoporte;
    }


    public double calcularCostoMaterialSoporte()
    {
      if ("ABS".equals(tipoMaterialSoprote)) 
      {
          double x = getPrecioGrExtruidoABS() * pesoGrMaterialSoporte;
          
          return x;
      }
      if ("PLA".equals(tipoMaterialSoprote)) 
      {
          double y = getPrecioGrExtruidoPLA() * pesoGrMaterialSoporte;
          
          return y;
      }
        return 0;
    }
    
     @Override
     public String toString()
     {
        double x;
        x = calcularPrecioPorPeso() + calcularPrecioElectricidad() + calcularValorDesperdicio() + calcularCostoMaterialSoporte();
        
        return "Valor De La pieza" + " " + x;
     }
  
}
