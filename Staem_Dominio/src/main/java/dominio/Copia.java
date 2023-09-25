package dominio;

/**
 * Representa una copia de un videojuego en la tienda. Cada copia tiene un
 * identificador único, un precio y está asociada a un videojuego.
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Copia {

    private int id; // Identificador único de la copia
    private float precio; // Precio de la copia
    private Videojuego videojuego; // Videojuego asociado a la copia

    /**
     * Constructor por defecto de la clase Copia.
     */
    public Copia() {
    }

    /**
     * Constructor de la clase Copia con precio y videojuego.
     *
     * @param precio El precio de la copia.
     * @param videojuego El videojuego asociado a la copia.
     */
    public Copia(float precio, Videojuego videojuego) {
        this.precio = precio;
        this.videojuego = videojuego;
    }

    /**
     * Constructor de la clase Copia con todos los parámetros.
     *
     * @param id El identificador único de la copia.
     * @param precio El precio de la copia.
     * @param videojuego El videojuego asociado a la copia.
     */
    public Copia(int id, float precio, Videojuego videojuego) {
        this.id = id;
        this.precio = precio;
        this.videojuego = videojuego;
    }

    /**
     * Obtiene el identificador único de la copia.
     *
     * @return El identificador único de la copia.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único de la copia.
     *
     * @param id El nuevo identificador de la copia.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el precio de la copia.
     *
     * @return El precio de la copia.
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Establece el precio de la copia.
     *
     * @param precio El nuevo precio de la copia.
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el videojuego asociado a la copia.
     *
     * @return El videojuego asociado a la copia.
     */
    public Videojuego getVideojuego() {
        return videojuego;
    }

    /**
     * Establece el videojuego asociado a la copia.
     *
     * @param videojuego El nuevo videojuego asociado a la copia.
     */
    public void setVideojuego(Videojuego videojuego) {
        this.videojuego = videojuego;
    }

    /**
     * Genera una representación en texto de esta copia.
     *
     * @return La representación en texto de la copia.
     */
    @Override
    public String toString() {
        return "Copia{" + "id=" + id + ", precio=" + precio + ", videojuego=" + videojuego + '}';
    }

    /**
     * Genera el hashCode de la copia basado en su identificador.
     *
     * @return El hashCode de la copia.
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + this.id;
        return hash;
    }

    /**
     * Compara esta copia con otro objeto para determinar si son iguales.
     *
     * @param obj El objeto a comparar con esta copia.
     * @return true si las copias son iguales, false en caso contrario.
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
        final Copia other = (Copia) obj;
        return this.id == other.id;
    }

}
