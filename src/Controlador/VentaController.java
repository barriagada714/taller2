
package Controlador;

import DAO.VentaDAO;
import Modelo.Vendedor;
import Modelo.Venta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import vista.RegistrarVenta;


public class VentaController implements ActionListener{

   private RegistrarVenta v;
  
   private VentaDAO ventaDAO;
    public VentaController(RegistrarVenta v) {
        
       ventaDAO = new VentaDAO();
       this.v = v;
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        if (comando == "insertarVenta") {
            Vendedor vendedor = (Vendedor) v.getVendedorCb().getSelectedItem();
            int monto = Integer.parseInt(v.getMontoTf().getText());
            String sucursal = v.getSucursalCb().getSelectedItem().toString();
            String fecha = v.getFechaTf().getText();

            Venta v = new Venta(fecha, 0, monto, sucursal, vendedor);

            boolean b = ventaDAO.insertarVenta(v);

        }
    }

}
