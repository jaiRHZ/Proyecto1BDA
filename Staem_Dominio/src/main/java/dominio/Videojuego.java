package dominio;

import java.util.List;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Videojuego {

    private int id; // Identificador único del videojuego
    private String titulo; // Título del videojuego
    private String genero; // Género del videojuego
    private String estudio; // Estudio desarrollador del videojuego
    private String clasificacion; // Clasificación del videojuego (por ejemplo: "E" para todos los públicos)

    private List<Copia> copias; // Lista de copias asociadas a este videojuego

    /**
     * Constructor por defecto de la clase Videojuego.
     */
    public Videojuego() {
    }

    /**
     * Constructor de la clase Videojuego con todos los atributos excepto la
     * lista de copias.
     *
     * @param id El identificador único del videojuego.
     * @param titulo El título del videojuego.
     * @param genero El género del videojuego.
     * @param estudio El estudio desarrollador del videojuego.
     * @param clasificacion La clasificación del videojuego.
     */
    public Videojuego(int id, String titulo, String genero, String estudio, String clasificacion) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.estudio = estudio;
        this.clasificacion = clasificacion;
    }

    /**
     * Constructor de la clase Videojuego con título, género, estudio y
     * clasificación.
     *
     * @param titulo El título del videojuego.
     * @param genero El género del videojuego.
     * @param estudio El estudio desarrollador del videojuego.
     * @param clasificacion La clasificación del videojuego.
     */
    public Videojuego(String titulo, String genero, String estudio, String clasificacion) {
        this.titulo = titulo;
        this.genero = genero;
        this.estudio = estudio;
        this.clasificacion = clasificacion;
    }

    /**
     * Constructor de la clase Videojuego con todos los atributos incluyendo la
     * lista de copias.
     *
     * @param id El identificador único del videojuego.
     * @param titulo El título del videojuego.
     * @param genero El género del videojuego.
     * @param estudio El estudio desarrollador del videojuego.
     * @param clasificacion La clasificación del videojuego.
     * @param copias La lista de copias asociadas a este videojuego.
     */
    public Videojuego(int id, String titulo, String genero, String estudio, String clasificacion, List<Copia> copias) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.estudio = estudio;
        this.clasificacion = clasificacion;
        this.copias = copias;
    }

    /**
     * Obtiene el identificador único del videojuego.
     *
     * @return El identificador único del videojuego.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único del videojuego.
     *
     * @param id El nuevo identificador único del videojuego.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el título del videojuego.
     *
     * @return El título del videojuego.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del videojuego.
     *
     * @param titulo El nuevo título del videojuego.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el género del videojuego.
     *
     * @return El género del videojuego.
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el género del videojuego.
     *
     * @param genero El nuevo género del videojuego.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtiene el estudio desarrollador del videojuego.
     *
     * @return El estudio desarrollador del videojuego.
     */
    public String getEstudio() {
        return estudio;
    }

    /**
     * Establece el estudio desarrollador del videojuego.
     *
     * @param estudio El nuevo estudio desarrollador del videojuego.
     */
    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    /**
     * Obtiene la clasificación del videojuego.
     *
     * @return La clasificación del videojuego.
     */
    public String getClasificacion() {
        return clasificacion;
    }

    /**
     * Establece la clasificación del videojuego.
     *
     * @param clasificacion La nueva clasificación del videojuego.
     */
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    /**
     * Genera una representación en texto del videojuego.
     *
     * @return Una cadena de texto que representa el videojuego.
     */
    @Override
    public String toString() {
        return "Videojuego{" + "id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", estudio=" + estudio + ", clasificacion=" + clasificacion + '}';
    }

    /**
     * Calcula el código hash del videojuego.
     *
     * @return El código hash del videojuego.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        return hash;
    }

    /**
     * Compara el videojuego con otro objeto para determinar si son iguales.
     *
     * @param obj El objeto a comparar.
     * @return true si son iguales, false en caso contrario.
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
        final Videojuego other = (Videojuego) obj;
        return this.id == other.id;
    }

}
