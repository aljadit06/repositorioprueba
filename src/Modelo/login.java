
package Modelo;


public class login {
    private int IDusuario;
    private String Nombres;
    private String Usuario;
    private String Contraseña;
    
    public login(){
        }
    
    public login(int IDusuario,String Nombres, String Usuario, String Contraseña) {
        this.IDusuario = IDusuario;
        this.Nombres = Nombres;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }
    
    public int getIdusuario() {
        return IDusuario;
    }
    
    public void setIDusuario(int IDusuario){
        this.IDusuario = IDusuario;
    }
     public String getNombres() {
        return Nombres;
    }
    
    public void setNombres(String Nombres){
        this.Nombres = Nombres;
    }
    public String getUsuario() {
        return Usuario;
    }
    public void setUsuario(String Usuario){
        this.Usuario = Usuario;
    }
     public String getContraseña() {
        return Contraseña;
    }
    public void setContraseña(String Contraseña){
        this.Contraseña = Contraseña;
    }
    
    
}
