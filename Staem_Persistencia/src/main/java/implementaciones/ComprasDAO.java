/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import conexionBD.IConexionBD;
import dominio.Compra;
import dominio.Copia;
import excepciones.SQLException;
import interfacesDAO.IComprasDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class ComprasDAO implements IComprasDAO {

    private final IConexionBD conexionBD;
    java.util.Date fechaActual = new java.util.Date();

    public ComprasDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    @Override
    public Compra agregarCompra(Compra compra, List<Copia> copias) throws SQLException {
        Connection conexion = null;
        try {
            conexion = conexionBD.getConnection();
            conexion.setAutoCommit(false); // Deshabilitar el modo de autocommit para iniciar la transacción

            // Crear un objeto de java.util.Date para obtener la fecha actual
            java.util.Date fechaActual = new java.util.Date();

            // Crear una sentencia SQL para insertar en la tabla compras
            String sql1 = "INSERT INTO compras (fechaOrden, idComprador) VALUES (?, ?)";
            try (PreparedStatement stmt1 = conexion.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS)) {
                stmt1.setDate(1, new java.sql.Date(fechaActual.getTime()));
                stmt1.setInt(2, compra.getComprador().getId());
                stmt1.executeUpdate();

                try (ResultSet rs = stmt1.getGeneratedKeys()) {
                    if (rs.next()) {
                        int idCompra = rs.getInt(1);
                        compra.setId(idCompra);
                    }
                }
            }

            String sql2 = "INSERT INTO compraCopias (idCompras, idCopia) VALUES (?, ?)";
            try (PreparedStatement stmt2 = conexion.prepareStatement(sql2)) {

                for (int i = 0; i < copias.size(); i++) {
                    stmt2.setInt(1, compra.getId());
                    stmt2.setInt(2, copias.get(i).getId());
                    stmt2.executeUpdate();
                }

            }

            // Confirmar la transacción
            conexion.commit();
            JOptionPane.showMessageDialog(null, "Compra registrada con éxito");
        } catch (SQLException ex) {
            if (conexion != null) {
                try {
                    conexion.rollback(); // Revertir la transacción en caso de error
                } catch (java.sql.SQLException ex1) {
                    Logger.getLogger(ComprasDAO.class.getName()).log(Level.SEVERE, null, ex1);
                }
            } // Manejar el error de rollback
            throw new SQLException("No se pudo guardar la compra: " + ex.getMessage());
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(ComprasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexion != null) {
                try {
                    conexion.setAutoCommit(true); // Restaurar el modo de autocommit
                } catch (java.sql.SQLException ex) {
                    Logger.getLogger(ComprasDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    conexion.close(); // Cerrar la conexión
                } catch (java.sql.SQLException ex) {
                    Logger.getLogger(ComprasDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            } // Manejar el error al cerrar la conexión
        }

        return compra;
    }

    @Override
    public void eliminarCompra(Compra compra) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Compra actualizarCompra(Compra compra) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Compra consultarCompra(Compra compra) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
