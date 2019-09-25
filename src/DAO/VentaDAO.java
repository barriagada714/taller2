
package DAO;

import Modelo.Vendedor;
import Modelo.Venta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class VentaDAO {
  
    Conexion con;

    public VentaDAO() {
        this.con = new Conexion();
    }
    
    public boolean insertarVenta( Venta v){
    
    Connection accesoBD = con.getConexion();
    
    try{
    
    
    String sql = "INSERT INTO venta(id_vendedor, monto, sucursal, fecha) VALUES ('" +v.getVendedor().getIdVendedor()+"' , '"+v.getMonto()+"'," +v.getSucursal()+","+ v.getFecha()+" )";
    
    Statement st = accesoBD.createStatement();
    st.execute(sql);
    return true;
    }
    catch(Exception e){
          System.out.println("Error al insertar venta");
          e.printStackTrace();
          return false;
    }
    
    }
}

