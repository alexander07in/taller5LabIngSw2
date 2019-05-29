package co.agenciaviajes.negocio;

/**
 * 29 de Mayo / 2019
 * @author Alexander Inagan
 */
public abstract class Pago {

    protected int valor;
    protected Cliente cliente;

    // Completar constructores
    public Pago(int valor, Cliente cliente) {
        this.valor = valor;
        this.cliente = cliente;
    }
    
    public Pago() {
        
    }
    
    public abstract void registrarPago();

    // Completar getters and setters
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    

}
