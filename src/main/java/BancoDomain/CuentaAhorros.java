package BancoDomain;

/**
 *
 * @author leysa
 */
public class CuentaAhorros extends CuentaBancaria {

    public CuentaAhorros(String numero, String nombre, String ciudad) {
        super(numero, nombre, ciudad);
    }

    @Override
    public String consignar(double valor, String ciudad) {
        String result = "";
        if (valor <= 0) {
            result = "El valor a consignar es incorrecto";
        } else if (valor >= 50000) {
            saldo += valor;
            result = "Su Nuevo Saldo es de $" + saldo + " pesos m/c";
        } else if (valor > 0 && valor < 50000) {
            result = "El valor mínimo de la primera consignación debe ser\n"
                    + "de $50.000 mil pesos. Su nuevo saldo es $0 pesos";
        }
        return result;
    }

    @Override
    public String retirar(double valor, String ciudad) {

        return "";
    }

}
