
package BancoDomain;


public  class CuentaBancaria implements IserviciosBancarios{
 
    private String numero;
    private String nombre;
    private String ciudad;
    protected double saldo;
     

    public CuentaBancaria(String numero, String nombre, String ciudad) {
        this.numero = numero;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.saldo = 0;
    }
    


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String consignar(double valor, String ciudad) {
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String retirar(double valor, String ciudad) {
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
