
package Modelo;

import java.util.ArrayList;


public class Venta {
    private String fecha;
    private int idVenta;
    private int monto;
    private String sucursal;
    private Vendedor vendedor;

    public Venta(String fecha, int idVenta, int monto, String sucursal, Vendedor vendedor) {
        this.fecha = fecha;
        this.idVenta = idVenta;
        this.monto = monto;
        this.sucursal = sucursal;
        this.vendedor = vendedor;
    }

    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    
    
  
   
    
}
