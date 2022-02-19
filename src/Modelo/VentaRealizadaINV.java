
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class VentaRealizadaINV {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    int r;
    
    public int RegistrarVenta(VentaRealizada v){
        String sql ="INSERT INTO ventasrealizadas(Nombre_pvr, Referencia_pvr, Precio_pvr) VALUES (?,?,?)";
        try{
         con = cn.getConnection();
         ps = con.prepareStatement(sql);
         ps.setString(1, v.getNombre_pvr());
         ps.setString(2, v.getReferencia_pvr());
         ps.setInt(3, v.getPrecio_pvr());
        }catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
         try{
             con.close();
     }catch(SQLException e) {
          System.out.println(e.toString());
         }
     }
        return r;
    }
 public int RegistrarDetalle(Detalle Dv)  {
     String sql = "INSERT INTO detalle (ID_prod, Cantidaddetalle, Preciodetalle, ID_Venta VALUES (?,?,?,?)";
     try{
     con = cn.getConnection();
     ps = con.prepareStatement(sql);
     ps.setInt(1, Dv.getIDdetalle());
     ps.setInt(2, Dv.getID_prod());
     ps.setInt(3, Dv.getPreciodetalle());
     ps.setInt(4, Dv.getID_Venta());
     ps.execute();
     }catch (SQLException e){
         System.out.println(e.toString());
     }finally{
         try{
             con.close();
     }catch(SQLException e) {
          System.out.println(e.toString());
         }
     }
  return r;
}
}