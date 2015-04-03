
package com.printing.modelo;


public class generalImprecion {
    
    private double desperdicio;
    private int dia;
    private int hora;
    private int minuto;
    private int segundo;
    static private double valorKwh;
    private String tipoMaterial;
    private static boolean usoSoporte;
            
    public generalImprecion() {
    }

    public generalImprecion(boolean usoSoporte) {
        this.usoSoporte = usoSoporte;
    }
    
    public generalImprecion(double desperdicio) {
        this.desperdicio = desperdicio;
    }

    public generalImprecion(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public double getDesperdicio() {
        return desperdicio;
    }

    public void setDesperdicio(double desperdicio) {
        this.desperdicio = desperdicio;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public double getValorKwh() {
        return valorKwh;
    }

    public void setValorKwh(double valorKwh) {
        this.valorKwh = valorKwh;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public boolean isUsoSoporte() {
        return usoSoporte;
    }

    public void setUsoSoporte(boolean usoSoporte) {
        this.usoSoporte = usoSoporte;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    public double calcularPrecioElectricidad()
    {
       double valorMinuto = this.valorKwh / 60;
       double valorSegundo = this.valorKwh / 3600;
       double valorDia = this.valorKwh * 24;
       
       double w = this.dia * valorDia;
       double x = this.hora * this.valorKwh;
       double y = this.minuto * valorMinuto;
       double z = this.segundo * valorSegundo;
       
        
       return w+x+y+z;
    }
    
}
