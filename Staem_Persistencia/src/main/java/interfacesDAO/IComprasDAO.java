package interfacesDAO;

import dominio.Compra;
import dominio.Copia;
import excepciones.SQLException;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IComprasDAO {

    public Compra agregarCompra(Compra compra, List<Copia> copias) throws SQLException;

    public void eliminarCompra(Compra compra) throws SQLException;

    public Compra actualizarCompra(Compra compra) throws SQLException;

    public Compra consultarCompra(Compra compra) throws SQLException;

}
