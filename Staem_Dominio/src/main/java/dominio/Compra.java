package dominio;

import java.util.Calendar;

/**
 * Representa una compra realizada por un comprador en una fecha específica.
 * 
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Compra {
    
    private int id; // Identificador único de la compra
    private Calendar fechaOrden; // Fecha en la que se realizó la compra
    
    private Comprador comprador; // El comprador asociado a esta compra

    /**
     * Constructor por defecto de la clase Compra.
     */
    public Compra() {
    }

    /**
     * Constructor de la clase Compra con fecha de orden y comprador.
     * 
     * @param fechaOrden La fecha en la que se realizó la compra.
     * @param comprador El comprador asociado a la compra.
     */
    public Compra(Calendar fechaOrden, Comprador comprador) {
        this.fechaOrden = fechaOrden;
        this.comprador = comprador;
    }

    /**
     * Constructor de la clase Compra con todos los parámetros.
     * 
     * @param id El identificador único de la compra.
     * @param fechaOrden La fecha en la que se realizó la compra.
     * @param comprador El comprador asociado a la compra.
     */
    public Compra(int id, Calendar fechaOrden, Comprador comprador) {
        this.id = id;
        this.fechaOrden = fechaOrden;
        this.comprador = comprador;
    }

    /**
     * Obtiene el identificador de la compra.
     * 
     * @return El identificador de la compra.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador de la compra.
     * 
     * @param id El nuevo identificador de la compra.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la fecha en la que se realizó la compra.
     * 
     * @return La fecha de la compra.
     */
    public Calendar getFechaOrden() {
        return fechaOrden;
    }

    /**
     * Establece la fecha en la que se realizó la compra.
     * 
     * @param fechaOrden La nueva fecha de la compra.
     */
    public void setFechaOrden(Calendar fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    /**
     * Obtiene el comprador asociado a la compra.
     * 
     * @return El comprador asociado a la compra.
     */
    public Comprador getComprador() {
        return comprador;
    }

    /**
     * Establece el comprador asociado a la compra.
     * 
     * @param comprador El nuevo comprador asociado a la compra.
     */
    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    /**
     * Genera una representación en texto de esta compra.
     * 
     * @return La representación en texto de la compra.
     */
    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", fechaOrden=" + fechaOrden + ", comprador=" + comprador + '}';
    }

    /**
     * Genera el hashCode de la compra basado en su identificador.
     * 
     * @return El hashCode de la compra.
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.id;
        return hash;
    }

    /**
     * Compara esta compra con otro objeto para determinar si son iguales.
     * 
     * @param obj El objeto a comparar con esta compra.
     * @return true si las compras son iguales, false en caso contrario.
     */
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
