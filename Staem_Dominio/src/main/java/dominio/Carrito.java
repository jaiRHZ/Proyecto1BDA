
package dominio;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Carrito {
    
    private int id;
    private int cantidad;
    
    private Compra compra;
    private Copia copia;

    public Carrito() {
    }

    public Carrito(int id, int cantidad, Compra compra, Copia copia) {
        this.id = id;
        this.cantidad = cantidad;
        this.compra = compra;
        this.copia = copia;
    }

    public Carrito(int cantidad, Compra compra, Copia copia) {
        this.cantidad = cantidad;
        this.compra = compra;
        this.copia = copia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Copia getCopia() {
        return copia;
    }

    public void setCopia(Copia copia) {
        this.copia = copia;
    }

    @Override
    public String toString() {
        return "Carrito{" + "id=" + id + ", cantidad=" + cantidad + ", compra=" + compra + ", copia=" + copia + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carrito other = (Carrito) obj;
        return this.id == other.id;
    }
    
    public float total(){
        return cantidad * copia.getPrecio();
}
    
}
