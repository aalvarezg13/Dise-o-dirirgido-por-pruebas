
package BancoDomain;

public interface IserviciosBancarios {
    
    public abstract String consignar(double valor, String ciudad);
    public abstract String retirar(double valor, String ciudad);
    
}
