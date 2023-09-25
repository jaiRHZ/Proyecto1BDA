package interfacesDAO;

import dominio.Copia;
import excepciones.SQLException;

/**
 *
 * @author HP
 */
public interface ICopiasDAO {

    public Copia agregarCopia(Copia copia) throws SQLException;

    public void eliminarCopia(Copia copia) throws SQLException;

    public Copia actualizarCopia(Copia copia) throws SQLException;

    public Copia consultarCopia(Integer id) throws SQLException;

}
