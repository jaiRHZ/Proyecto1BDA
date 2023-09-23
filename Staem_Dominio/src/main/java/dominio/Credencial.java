package dominio;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Credencial {

    private int id;
    private String usuario;
    private String contrasenya;

    public Credencial() {
    }

    public Credencial(String usuario, String contrasenya) throws NoSuchAlgorithmException {
        this.usuario = usuario;
        this.contrasenya = encriptarContrasena(contrasenya);
    }

    public Credencial(int id, String usuario, String contrasenya) throws NoSuchAlgorithmException {
        this.id = id;
        this.usuario = usuario;
        this.contrasenya = encriptarContrasena(contrasenya);
    }

    public static String encriptarContrasena(String contrasena) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(contrasena.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    @Override
    public String toString() {
        return "Credencial{" + "id=" + id + ", usuario=" + usuario + ", contrasenya=" + contrasenya + '}';
    }

}
