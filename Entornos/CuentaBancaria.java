package Entornos.Entornos;
/**
 * Clase que representa una Cuenta Bancaria.
 */
public class CuentaBancaria {
    private double saldo;
    private String numeroCuenta;

    /**
     * Constructor de la CuentaBancaria.
     * @param saldo Saldo inicial de la cuenta.
     * @param numeroCuenta Número de cuenta.
     */
    public CuentaBancaria(double saldo, String numeroCuenta) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * Deposita dinero en la cuenta.
     * @param cantidad Cantidad a depositar.
     */
    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }

    /**
     * Retira dinero de la cuenta si hay saldo suficiente.
     * @param cantidad Cantidad a retirar.
     * @return true si la operación fue exitosa, false en caso contrario.
     */
    public boolean retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }
}
