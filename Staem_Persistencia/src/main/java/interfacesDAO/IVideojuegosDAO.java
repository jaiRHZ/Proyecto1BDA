package interfacesDAO;

import dominio.Videojuego;
import excepciones.SQLException;

/**
 *
 * @author HP
 */
public interface IVideojuegosDAO {

    public Videojuego agregarVideojuego(Videojuego videojuego) throws SQLException;
    
    public void eliminarVideojuego(Videojuego videojuego);
    
    public Videojuego actualizarVideojuego(Videojuego videojuego);
    
    public Videojuego consultarVideojuego(Videojuego videojuego);

}
