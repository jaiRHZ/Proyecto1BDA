package dominio;

import java.util.List;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Comprador {

    private int id; // Identificador único del comprador
    private String email; // Dirección de correo electrónico del comprador
    private String nombres; // Nombres del comprador
    private String aPaterno; // Apellido paterno del comprador
    private String aMaterno; // Apellido materno del comprador

    private Domicilio domicilio; // instancia de la clase domicilio
    private Credencial credencial; //instancia de la clase credencial
    private List<Compra> compras; // Lista de compras realizadas por el comprador

    /**
     * Constructor por defecto de la clase Comprador.
     */
    public Comprador() {
    }

    /**
     * Constructor de la clase Comprador con parámetros básicos.
     * 
     * @param email La dirección de correo electrónico del comprador.
     * @param nombres Los nombres del comprador.
     * @param aPaterno El apellido paterno del comprador.
     * @param aMaterno El apellido materno del comprador.
     * @param domicilio El domicilio del comprador.
     * @param credencial La credencial del comprador.
     */
    public Comprador(String email, String nombres, String aPaterno, String aMaterno, Domicilio domicilio, Credencial credencial) {
        this.email = email;
        this.nombres = nombres;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.domicilio = domicilio;
        this.credencial = credencial;
    }

    /**
     * Constructor de la clase Comprador con todos los parámetros.
     * 
     * @param id El identificador único del comprador.
     * @param email La dirección de correo electrónico del comprador.
     * @param nombres Los nombres del comprador.
     * @param aPaterno El apellido paterno del comprador.
     * @param aMaterno El apellido materno del comprador.
     * @param domicilio El domicilio del comprador.
     * @param credencial La credencial del comprador.
     * @param compras La lista de compras realizadas por el comprador.
     */
    public Comprador(int id, String email, String nombres, String aPaterno, String aMaterno, Domicilio domicilio, Credencial credencial, List<Compra> compras) {
        this.id = id;
        this.email = email;
        this.nombres = nombres;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.domicilio = domicilio;
        this.credencial = credencial;
        this.compras = compras;
    }

    /**
     * Obtiene la lista de compras realizadas por el comprador.
     *
     * @return La lista de compras realizadas por el comprador.
     */
    public List<Compra> getCompras() {
        return compras;
    }

    /**
     * Establece la lista de compras realizadas por el comprador.
     *
     * @param compras La nueva lista de compras del comprador.
     */
    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    /**
     * Obtiene el identificador único del comprador.
     *
     * @return El identificador único del comprador.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único del comprador.
     *
     * @param id El nuevo identificador del comprador.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la dirección de correo electrónico del comprador.
     *
     * @return La dirección de correo electrónico del comprador.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece la dirección de correo electrónico del comprador.
     *
     * @param email La nueva dirección de correo electrónico del comprador.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene los nombres del comprador.
     *
     * @return Los nombres del comprador.
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Establece los nombres del comprador.
     *
     * @param nombres Los nuevos nombres del comprador.
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * Obtiene el apellido paterno del comprador.
     *
     * @return El apellido paterno del comprador.
     */
    public String getaPaterno() {
        return aPaterno;
    }

    /**
     * Establece el apellido paterno del comprador.
     *
     * @param aPaterno El nuevo apellido paterno del comprador.
     */
    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    /**
     * Obtiene el apellido materno del comprador.
     *
     * @return El apellido materno del comprador.
     */
    public String getaMaterno() {
        return aMaterno;
    }

    /**
     * Establece el apellido materno del comprador.
     *
     * @param aMaterno El nuevo apellido materno del comprador.
     */
    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    /**
     * Obtiene el domicilio del comprador.
     *
     * @return El domicilio del comprador.
     */
    public Domicilio getDomicilio() {
        return domicilio;
    }

    /**
     * Establece el domicilio del comprador.
     *
     * @param domicilio El nuevo domicilio del comprador.
     */
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * Obtiene la credencial del comprador.
     *
     * @return La credencial del comprador.
     */
    public Credencial getCredencial() {
        return credencial;
    }

    /**
     * Establece la credencial del comprador.
     *
     * @param credencial La nueva credencial del comprador.
     */
    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }
    
    
    /**
 * Retorna una representación en texto de la información del comprador.
 * 
 * @return Una cadena de texto que representa al comprador.
 */
@Override
public String toString() {
    return "Comprador{" + "email=" + email + ", nombres=" + nombres + ", aPaterno=" + aPaterno + ", aMaterno=" + aMaterno + ", domicilio=" + domicilio + ", credencial=" + credencial + '}';
}

/**
 * Calcula un valor hash único para el comprador, basado en su identificador.
 * 
 * @return El valor hash del comprador.
 */
@Override
public int hashCode() {
    int hash = 3;
    hash = 41 * hash + this.id;
    return hash;
}

/**
 * Compara este comprador con otro objeto para determinar si son iguales.
 * 
 * @param obj El objeto a comparar con este comprador.
 * @return true si los compradores son iguales, false en caso contrario.
 */
@Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if (getClass() != obj.getClass()) {
        return false;
    }
    final Comprador other = (Comprador) obj;
    return this.id == other.id;
}


}
