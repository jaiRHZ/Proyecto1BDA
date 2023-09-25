package dominio;

/**
 * Esta clase representa un carrito de compras que contiene una copia de un producto.
 * Puede almacenar la cantidad de productos y la compra asociada.
 * 
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Carrito {
    
    private int id; // Identificador único del carrito
    private int cantidad; // Cantidad de productos en el carrito
    
    private Compra compra; // La compra asociada a este carrito
    private Copia copia; // La copia del producto en el carrito

    /**
     * Constructor por defecto de la clase Carrito.
     */
    public Carrito() {
    }

    /**
     * Constructor de la clase Carrito con todos los parámetros.
     * 
     * @param id El identificador único del carrito.
     * @param cantidad La cantidad de productos en el carrito.
     * @param compra La compra asociada a este carrito.
     * @param copia La copia del producto en el carrito.
     */
    public Carrito(int id, int cantidad, Compra compra, Copia copia) {
        this.id = id;
        this.cantidad = cantidad;
        this.compra = compra;
        this.copia = copia;
    }

    /**
     * Constructor de la clase Carrito sin el identificador.
     * 
     * @param cantidad La cantidad de productos en el carrito.
     * @param compra La compra asociada a este carrito.
     * @param copia La copia del producto en el carrito.
     */
    public Carrito(int cantidad, Compra compra, Copia copia) {
        this.cantidad = cantidad;
        this.compra = compra;
        this.copia = copia;
    }

    /**
     * Obtiene el identificador del carrito.
     * 
     * @return El identificador del carrito.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del carrito.
     * 
     * @param id El nuevo identificador del carrito.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la cantidad de productos en el carrito.
     * 
     * @return La cantidad de productos en el carrito.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad de productos en el carrito.
     * 
     * @param cantidad La nueva cantidad de productos en el carrito.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene la compra asociada a este carrito.
     * 
     * @return La compra asociada a este carrito.
     */
    public Compra getCompra() {
        return compra;
    }

    /**
     * Establece la compra asociada a este carrito.
     * 
     * @param compra La nueva compra asociada a este carrito.
     */
    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    /**
     * Obtiene la copia del producto en el carrito.
     * 
     * @return La copia del producto en el carrito.
     */
    public Copia getCopia() {
        return copia;
    }

    /**
     * Establece la copia del producto en el carrito.
     * 
     * @param copia La nueva copia del producto en el carrito.
     */
    public void setCopia(Copia copia) {
        this.copia = copia;
    }

    /**
     * Calcula el total del carrito multiplicando la cantidad de productos por el precio de la copia.
     * 
     * @return El total del carrito.
     */
    public float total(){
        return cantidad * copia.getPrecio();
    }

    /**
     * Genera el hashCode del carrito basado en su identificador.
     * 
     * @return El hashCode del carrito.
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        return hash;
    }

    /**
     * Compara este carrito con otro objeto para determinar si son iguales.
     * 
     * @param obj El objeto a comparar con este carrito.
     * @return true si los carritos son iguales, false en caso contrario.
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
        final Carrito other = (Carrito) obj;
        return this.id == other.id;
    }
    
    /**
     * Genera una representación en texto de este carrito.
     * 
     * @return La representación en texto del carrito.
     */
    @Override
    public String toString() {
        return "Carrito{" + "id=" + id + ", cantidad=" + cantidad + ", compra=" + compra + ", copia=" + copia + '}';
    }
}
