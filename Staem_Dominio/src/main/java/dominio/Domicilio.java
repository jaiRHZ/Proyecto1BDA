package dominio;

/**
 * Representa la información de un domicilio, incluyendo calle, número y código postal.
 * 
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Domicilio {

    private String calle; // Nombre de la calle
    private String numero; // Número del domicilio
    private String codigoPostal; // Código postal

    /**
     * Constructor por defecto de la clase Domicilio.
     */
    public Domicilio() {
    }

    /**
     * Constructor de la clase Domicilio con calle, número y código postal.
     * 
     * @param calle El nombre de la calle.
     * @param numero El número del domicilio.
     * @param codigoPostal El código postal.
     */
    public Domicilio(String calle, String numero, String codigoPostal) {
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
    }

    /**
     * Obtiene el nombre de la calle del domicilio.
     * 
     * @return El nombre de la calle.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Establece el nombre de la calle del domicilio.
     * 
     * @param calle El nuevo nombre de la calle.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el número del domicilio.
     * 
     * @return El número del domicilio.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Establece el número del domicilio.
     * 
     * @param numero El nuevo número del domicilio.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Obtiene el código postal del domicilio.
     * 
     * @return El código postal.
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Establece el código postal del domicilio.
     * 
     * @param codigoPostal El nuevo código postal.
     */
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * Genera una representación en texto del domicilio.
     * 
     * @return Una cadena de texto que representa el domicilio.
     */
    @Override
    public String toString() {
        return "Domicilio{" + "calle=" + calle + ", numero=" + numero + ", codigoPostal=" + codigoPostal + '}';
    }

}
