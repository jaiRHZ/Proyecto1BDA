package dominio;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Credencial {

    private int id; // Identificador único de la credencial
    private String usuario; // Nombre de usuario
    private String contrasenya; // Contraseña encriptada

    /**
     * Constructor por defecto de la clase Credencial.
     */
    public Credencial() {
    }

    /**
     * Constructor de la clase Credencial con nombre de usuario y contraseña. La
     * contraseña se encripta antes de almacenarse.
     *
     * @param usuario El nombre de usuario.
     * @param contrasenya La contraseña en texto claro.
     * @throws NoSuchAlgorithmException Si no se encuentra el algoritmo de
     * encriptación.
     */
    public Credencial(String usuario, String contrasenya) throws NoSuchAlgorithmException {
        this.usuario = usuario;
        this.contrasenya = encriptarContrasena(contrasenya);
    }

    /**
     * Constructor de la clase Credencial con todos los parámetros. La
     * contraseña se encripta antes de almacenarse.
     *
     * @param id El identificador único de la credencial.
     * @param usuario El nombre de usuario.
     * @param contrasenya La contraseña en texto claro.
     * @throws NoSuchAlgorithmException Si no se encuentra el algoritmo de
     * encriptación.
     */
    public Credencial(int id, String usuario, String contrasenya) throws NoSuchAlgorithmException {
        this.id = id;
        this.usuario = usuario;
        this.contrasenya = encriptarContrasena(contrasenya);
    }

    /**
     * Encripta la contraseña usando el algoritmo SHA-256.
     *
     * @param contrasena La contraseña en texto claro.
     * @return La contraseña encriptada.
     * @throws NoSuchAlgorithmException Si no se encuentra el algoritmo de
     * encriptación.
     */
    public static String encriptarContrasena(String contrasena) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(contrasena.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    /**
     * Obtiene el nombre de usuario asociado a las credenciales.
     *
     * @return El nombre de usuario.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Establece el nombre de usuario asociado a las credenciales.
     *
     * @param usuario El nuevo nombre de usuario.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene la contraseña encriptada asociada a las credenciales.
     *
     * @return La contraseña encriptada.
     */
    public String getContrasenya() {
        return contrasenya;
    }

    /**
     * Establece la contraseña en texto claro y la encripta antes de asignarla.
     *
     * @param contrasenya La nueva contraseña en texto claro.
     * @throws NoSuchAlgorithmException Si no se encuentra el algoritmo de
     * encriptación.
     */
    public void setContrasenya(String contrasenya) throws NoSuchAlgorithmException {
        this.contrasenya = encriptarContrasena(contrasenya);
    }

    /**
     * Genera una representación en texto de las credenciales.
     *
     * @return Una cadena de texto que representa las credenciales.
     */
    @Override
    public String toString() {
        return "Credencial{" + "id=" + id + ", usuario=" + usuario + ", contrasenya=" + contrasenya + '}';
    }

}
