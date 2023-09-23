package interfacesDAO;

import dominio.Videojuego;
import excepciones.SQLException;

/**
 *
 * @author HP
 */
public interface IVideojuegosDAO {

    public Videojuego guardarVideojuego(Videojuego viodeojuego) throws SQLException;

}
