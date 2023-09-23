
package interfacesDAO;

import dominio.Comprador;
import excepciones.SQLException;

/**
 *
 * @author HP
 */
public interface ICompradoresDAO {
    
    public Comprador agregarComprador(Comprador comprador) throws SQLException;
    
    public void eliminarComprador(Comprador comprador) throws SQLException;
    
    public Comprador actualizarComprador(Comprador comprador) throws SQLException;
    
    public Comprador consultarComprador(Comprador comprador) throws SQLException;
}
