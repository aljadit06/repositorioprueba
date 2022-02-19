
package Modelo;


public class Detalle {
    private int IDdetalle;
    private int ID_prod;
    private int Cantidaddetalle;
    private int Preciodetalle;
    private int ID_Venta;
    
    public Detalle(){
    }

    public Detalle(int IDdetalle, int ID_prod, int Cantidaddetalle, int Preciodetalle, int ID_Venta) {
        this.IDdetalle = IDdetalle;
        this.ID_prod = ID_prod;
        this.Cantidaddetalle = Cantidaddetalle;
        this.Preciodetalle = Preciodetalle;
        this.ID_Venta = ID_Venta;
    }

    public int getIDdetalle() {
        return IDdetalle;
    }

    public void setIDdetalle(int IDdetalle) {
        this.IDdetalle = IDdetalle;
    }

    public int getID_prod() {
        return ID_prod;
    }

    public void setID_prod(int ID_prod) {
        this.ID_prod = ID_prod;
    }

    public int getCantidaddetalle() {
        return Cantidaddetalle;
    }

    public void setCantidaddetalle(int Cantidaddetalle) {
        this.Cantidaddetalle = Cantidaddetalle;
    }

    public int getPreciodetalle() {
        return Preciodetalle;
    }

    public void setPreciodetalle(int Preciodetalle) {
        this.Preciodetalle = Preciodetalle;
    }

    public int getID_Venta() {
        return ID_Venta;
    }

    public void setID_Venta(int ID_Venta) {
        this.ID_Venta = ID_Venta;
    }
    
    
}
