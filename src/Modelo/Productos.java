
package Modelo;





public class Productos {
    private int IDproducto;
    private String NombreProducto;
    private String Referencia;
    private int Precio;
    private int Peso;
    private String Categoria;  
    private int Stock;
    private String FechaCreacion;
    
    
    public Productos(){
        
    }

    public Productos(int IDproducto, String NombreProducto, String Referencia, int Precio, int Peso, String Categoria, int Stock, String FechaCreacion) {
        this.IDproducto = IDproducto;
        this.NombreProducto = NombreProducto;
        this.Referencia = Referencia;
        this.Precio = Precio;
        this.Peso = Peso;
        this.Categoria = Categoria;
        this.Stock = Stock;
        this.FechaCreacion = FechaCreacion;
        
    }

    public int getIDproducto() {
        return IDproducto;
    }

    public void setIDproducto(int IDproducto) {
        this.IDproducto = IDproducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    public String getFechaCreacion() {
        return FechaCreacion;
    }   
     public void setFechaCreacion(String FechaCreacion) {
        this.FechaCreacion = FechaCreacion;         
    }



}