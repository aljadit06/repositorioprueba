
package Modelo;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ProductosINV {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
   
    
    public boolean RegistrarProductos(Productos pro){
        String sql = "INSERT INTO Productos (NombreProducto,Referencia,Precio,Peso,Categoria,Stock,FechaCreacion) VALUES(?,?,?,?,?,?,?)";
        try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, pro.getNombreProducto());
        ps.setString(2, pro.getReferencia());
        ps.setInt(3, pro.getPrecio());
        ps.setInt(4, pro.getPeso());
        ps.setString(5, pro.getCategoria());
        ps.setInt(6, pro.getStock());
        ps.setString(7, pro.getFechaCreacion());
        ps.execute();
        return true;
    }catch (SQLException e) {
        System.out.println(e.toString());
        return false;
    }  
    
}
    
    public List ListarProductos() {
        List<Productos> Listapro = new ArrayList();
        String sql = "SELECT * FROM productos";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Productos pro = new Productos();
                pro.setIDproducto(rs.getInt("IDproducto"));
                pro.setNombreProducto(rs.getString("NombreProducto"));
                pro.setReferencia(rs.getString("Referencia"));
                pro.setPrecio(rs.getInt("Precio"));
                pro.setPeso(rs.getInt("Peso"));
                pro.setCategoria(rs.getString("Categoria"));
                pro.setStock(rs.getInt("Stock"));
                pro.setFechaCreacion(rs.getString("FechaCreacion"));
                Listapro.add(pro);
                }
        }catch(SQLException e) {
                System.out.println(e.toString());
        }
        return Listapro;
        }
    public boolean EliminarProducto(int IDproducto){
      String sql = "DELETE FROM productos WHERE IDproducto = ?";
      try {
          ps = con.prepareStatement(sql);
          ps.setInt(1, IDproducto);
          ps.execute();
          return true;
      }catch(SQLException e) {
          System.out.println(e.toString());
          return false;
      }finally{
          try {
              con.close();
          } catch (SQLException ex) {
             System.out.println(ex.toString());
          }
      
      }
    
    }
    
    public boolean EditarProducto(Productos pro){
        String sql = "UPDATE productos SET NombreProducto=?, Referencia=?, Precio=?, Peso=?, Categoria=?, Stock=?, FechaCreacion=? WHERE IDproducto =?";
        try {
          ps =  con.prepareStatement(sql);
          ps.setString(1, pro.getNombreProducto());
          ps.setString(2, pro.getReferencia());
          ps.setInt(3, pro.getPrecio());
          ps.setInt(4, pro.getPeso());
          ps.setString(5, pro.getCategoria());
          ps.setInt(6, pro.getStock());
          ps.setString(7, pro.getFechaCreacion());
          ps.setInt(8, pro.getIDproducto());
          ps.execute();
          return true;
        }catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
    public Productos BuscarPro(int IDproducto){
        Productos producto = new Productos();
        String sql = "SELECT * FROM productos WHERE IDproducto = ?";
        try{
            con = cn.getConnection();
            ps= con.prepareStatement(sql);
            ps.setInt(1, IDproducto);
            rs = ps.executeQuery();
            if(rs.next()) {
                producto.setNombreProducto(rs.getString("NombreProducto"));
                producto.setPrecio(rs.getInt("Precio"));
                producto.setStock(rs.getInt("Stock"));
        
            }
           }catch(SQLException e){
               System.out.println(e.toString());
        }
           return producto;
    }
    
    public boolean ActualizarStock(int Cantidad, int IDproducto){
    String sql = "UPDATE productos SET Stock = ? WHERE IDproducto = ?";
    try{
    con = cn.getConnection();
    ps = con.prepareStatement(sql);
    ps.setInt(1, Cantidad);
    ps.setInt(2, IDproducto);
    ps.execute();
    return true;
    }catch (SQLException e) {
    System.out.println(e.toString());
    return false;
    }
}
}


