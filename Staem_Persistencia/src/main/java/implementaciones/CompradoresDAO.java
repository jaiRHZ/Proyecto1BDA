package implementaciones;

import conexionBD.IConexionBD;
import dominio.Comprador;
import excepciones.SQLException;
import interfacesDAO.ICompradoresDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class CompradoresDAO implements ICompradoresDAO {

    private final IConexionBD conexionBD;

    public CompradoresDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    @Override
    public Comprador agregarComprador(Comprador comprador) throws SQLException {
        String sql = "insert into compradores(email,usuario,nombres,aPaterno,aMaterno,calle,numero,codigoPostal,contrasena) values(?,?,?,?,?,?,?,?,?)";

        try (Connection conexion = conexionBD.getConnection();
                PreparedStatement comando = conexion.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);) {

            comando.setString(1, comprador.getEmail());
            comando.setString(2, comprador.getCredencial().getUsuario());
            comando.setString(3, comprador.getNombres());
            comando.setString(4, comprador.getaPaterno());
            comando.setString(5, comprador.getaMaterno());
            comando.setString(6, comprador.getDomicilio().getCalle());
            comando.setString(7, comprador.getDomicilio().getNumero());
            comando.setString(8, comprador.getDomicilio().getCodigoPostal());
            comando.setString(9, comprador.getCredencial().getContrasenya());
            comando.executeUpdate();
            ResultSet rs = comando.getGeneratedKeys();

            while (rs.next()) {
                int claveGenerada = rs.getInt(1);
                comprador.setId(claveGenerada);
                JOptionPane.showMessageDialog(null, "Usuario Guardado con EXITO");
                return comprador;
            }
        } catch (Exception ex) {

            throw new SQLException("No se pudo guardar el usuario " + ex.getMessage());
        }
        return null;
    }

    @Override
    public void eliminarComprador(Comprador comprador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Comprador actualizarComprador(Comprador comprador) throws SQLException {

        String sql = "update compradores set email=?, usuario=?, nombres=?, aPatero=?,"
                + "aMaterno=?, calle=?, numero=?, codigoPostal=? where id=?";
        try (Connection conexion = conexionBD.getConnection();
                PreparedStatement comando = conexion.prepareStatement(sql)) {
            comando.setString(1, comprador.getEmail());
            comando.setString(2, comprador.getCredencial().getUsuario());
            comando.setString(3, comprador.getNombres());
            comando.setString(4, comprador.getaPaterno());
            comando.setString(5, comprador.getaMaterno());
            comando.setString(6, comprador.getDomicilio().getCalle());
            comando.setString(7, comprador.getDomicilio().getNumero());
            comando.setString(8, comprador.getDomicilio().getCodigoPostal());
            comando.setInt(9, comprador.getId());
            ResultSet resultado = comando.executeQuery();
            JOptionPane.showMessageDialog(null, "El comprador se actualizo con exito");
            while (resultado.next()) {
                return comprador;
            }
        } catch (Exception ex) {
            throw new SQLException("No se pudo actualizar el comprador " + ex.getMessage());
        }
        return null;
    }

    @Override
    public Comprador consultarComprador(Comprador comprador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
