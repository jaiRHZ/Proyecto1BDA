package dominio;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Copia {

    private int id;
    private float precio;
    private Videojuego videojuego;

    public Copia() {
    }

    public Copia(float precio, Videojuego videojuego) {
        this.precio = precio;
        this.videojuego = videojuego;
    }

    public Copia(int id, float precio, Videojuego videojuego) {
        this.id = id;
        this.precio = precio;
        this.videojuego = videojuego;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Videojuego getVideojuego() {
        return videojuego;
    }

    public void setVideojuego(Videojuego videojuego) {
        this.videojuego = videojuego;
    }

    @Override
    public String toString() {
        return "Copia{" + "id=" + id + ", precio=" + precio + ", videojuego=" + videojuego + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + this.id;
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
        final Copia other = (Copia) obj;
        return this.id == other.id;
    }

}
