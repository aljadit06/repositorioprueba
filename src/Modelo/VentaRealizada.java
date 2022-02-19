
package Modelo;


public class VentaRealizada {
    
    private int IDvr;
    private String Nombre_pvr;
    private String Referencia_pvr;
    private int Precio_pvr;
    
    public VentaRealizada(){
    }

    public VentaRealizada(int IDvr, String Nombre_pvr, String Referencia_pvr, int Precio_pvr) {
        this.IDvr = IDvr;
        this.Nombre_pvr = Nombre_pvr;
        this.Referencia_pvr = Referencia_pvr;
        this.Precio_pvr = Precio_pvr;
    }

    public int getIDvr() {
        return IDvr;
    }

    public void setIDvr(int IDvr) {
        this.IDvr = IDvr;
    }

    public String getNombre_pvr() {
        return Nombre_pvr;
    }

    public void setNombre_pvr(String Nombre_pvr) {
        this.Nombre_pvr = Nombre_pvr;
    }

    public String getReferencia_pvr() {
        return Referencia_pvr;
    }

    public void setReferencia_pvr(String Referencia_pvr) {
        this.Referencia_pvr = Referencia_pvr;
    }

    public int getPrecio_pvr() {
        return Precio_pvr;
    }

    public void setPrecio_pvr(int Precio_pvr) {
        this.Precio_pvr = Precio_pvr;
    }
    
}
