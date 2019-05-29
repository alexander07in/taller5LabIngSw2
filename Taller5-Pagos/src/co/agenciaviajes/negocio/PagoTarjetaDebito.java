package co.agenciaviajes.negocio;

/**
 * 29 de Mayo / 2019
 * @author Alexander Inagan
 */
public class PagoTarjetaDebito extends Pago {

    private String codigo;
    private String banco;
    private String numeroCuenta;
    
    public PagoTarjetaDebito() {
        super();   
    }
    
    public PagoTarjetaDebito(int valor, Cliente cliente, String codigo, String banco, String numeroCuenta)
    {
        super(valor, cliente); 
        this.codigo = codigo;
        this.banco = banco;
        this.numeroCuenta = numeroCuenta;
    }
    
    @Override
    public void registrarPago() {
       //Aqui vendria la logica para grabar en la base de datos
        System.out.println("------------------------------------------------------");
        Cliente miCliente = new Cliente("98123458", "Manuel", "Lara", "M", "mlara@gmail.com");
        this.setCliente(miCliente);

        this.setValor(2650000); // Cualquier valor de una logica de negocio que aun no se tiene
        this.setCodigo("1254578");
        this.setBanco("Bancolombia");
        this.setNumeroCuenta("5125-6645-1245");

        System.out.println("Pago con tarjeta débito registrado en el sistema con éxito.");
        System.out.println("Cliente: " + this.getCliente().toString());
        System.out.println("Código del Cliente: " + this.getCodigo());
        System.out.println("Banco: " + this.getBanco());
        System.out.println("Número de Cuenta: " + this.getNumeroCuenta());
        System.out.println("Valor: " + this.getValor());
   }

    //Getters and Setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
}
