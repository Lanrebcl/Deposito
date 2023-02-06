package cuentas;

/**
 * @author Jaime B
 */
public class CCuenta {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Nombre de la cuenta
     */
    private String nombre;

    /**
     * Numero de la cuenta
     */
    private String cuenta;

    /**
     * Saldo de la cuenta
     */
    private double saldo;

    /**
     * Tipo de interes de la cuenta
     */
    private double tipoInterés;

    public CCuenta() {
    }

    /**
     * Constructor de cuentas.
     *
     * @param nom nombre de la cuenta
     * @param cue numero de la cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interes de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Obtiene el saldo de la cuenta y lo devuelve.
     *
     * @return saldo de la cuenta
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Metodo ingresar dinero.
     * <p>
     * Este metodo recibe la cantidad de dinero a ingresar y, a no ser que la
     * cantidad sea negativa, establece el nuevo saldo de la cuenta sumando el
     * saldo que hubiese mas lo ingresado.
     *
     * @param cantidad dinero a ingresar en la cuenta
     * @throws Exception lanza una excepcion si se introduce numero negativo de
     * dinero
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo retirar dinero.
     * <p>
     * Este metodo recibe la cantidad de dinero a retirar y, a no ser que la
     * cantidad sea negativa, establece el nuevo saldo de la cuenta restando el
     * saldo que hubiese menos lo ingresado.
     *
     * @param cantidad dinero a retirar de la cuenta
     * @throws Exception lanza una excepcion si se introduce un numero negativo
     * de dinero
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}
