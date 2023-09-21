
package dominio;

import java.util.Calendar;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Compra {
    
    private int id;
    private Calendar fechaOrden;
    
    private Comprador comprador;

    
    public Compra() {
    }

    public Compra(Calendar fechaOrden, Comprador comprador) {
        this.fechaOrden = fechaOrden;
        this.comprador = comprador;
    }

    public Compra(int id, Calendar fechaOrden, Comprador comprador) {
        this.id = id;
        this.fechaOrden = fechaOrden;
        this.comprador = comprador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Calendar fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", fechaOrden=" + fechaOrden + ", comprador=" + comprador + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.id;
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
        final Compra other = (Compra) obj;
        return this.id == other.id;
    }

    
}
