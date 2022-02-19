
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginINV {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public login log(String Usuario, String Contraseña){
        login l = new login();
        String sql = "SELECT * FROM Usuarios WHERE Usuario = ? AND Contraseña = ?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Usuario);
            ps.setString(2, Contraseña);
            rs= ps.executeQuery();
            if (rs.next()) {
                l.setIDusuario(rs.getInt("IDusuario"));
                l.setNombres(rs.getString("Nombres"));
                l.setUsuario(rs.getString("Usuario"));
                l.setContraseña(rs.getString("Contraseña"));
            }
            }catch (Exception e){
                System.out.println(e.toString());
        }
        return l;
    }
    
}
