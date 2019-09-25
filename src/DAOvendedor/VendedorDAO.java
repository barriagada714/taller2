
package DAO;

import Modelo.Vendedor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class VendedorDAO {

    public VendedorDAO() {
        this.
    }
    
    
      public Vendedor getVendedor( int id) throws SQLException{
        
        
        Vendedor v1;
        Connection accesoBD = con.getConexion();
        
        
        try{
             String sql="SELECT * FROM persona WHERE id="+id;
             Statement st = accesoBD.createStatement();
             ResultSet rs = st.executeQuery(sql);
             
            if (rs.first()) {
                
              String nombre= rs.getString("nombre");
              String apellido = rs.getString("apellido");
              int edad= rs.getInt("edad");
              
              v1= new vendedor(nombre, apellido, edad, id);
              return v1;
              
            }else{
                return null;
        
            }
        }
        catch (Exception e){
                System.out.println("Error al Obtener");
                e.printStackTrace();
                return null;
                
                }
        }
}
