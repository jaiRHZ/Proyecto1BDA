
package dominio;

import java.util.List;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Videojuego {
    
    private int id;
    private String titulo;
    private String genero;
    private String estudio;
    private String clasificacion;
    
    private List<Copia> copias;    

    public Videojuego() {
    }

    public Videojuego(int id, String titulo, String genero, String estudio, String clasificacion) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.estudio = estudio;
        this.clasificacion = clasificacion;
    }

    public Videojuego(String titulo, String genero, String estudio, String clasificacion) {
        this.titulo = titulo;
        this.genero = genero;
        this.estudio = estudio;
        this.clasificacion = clasificacion;
    }

    public Videojuego(int id, String titulo, String genero, String estudio, String clasificacion, List<Copia> copias) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.estudio = estudio;
        this.clasificacion = clasificacion;
        this.copias = copias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "Videojuego{" + "id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", estudio=" + estudio + ", clasificacion=" + clasificacion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
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
        final Videojuego other = (Videojuego) obj;
        return this.id == other.id;
    }
    
    
    
}
