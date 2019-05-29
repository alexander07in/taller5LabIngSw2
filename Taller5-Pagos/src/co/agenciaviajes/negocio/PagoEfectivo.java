package co.agenciaviajes.negocio;

/**
 * 29 de Mayo / 2019
 * @author Alexander Inagan
 */
public class PagoEfectivo extends Pago {

    public PagoEfectivo() {
        super();
    }
    
    public PagoEfectivo(int valor, Cliente cliente) {
        super(valor, cliente);
    }
    
    @Override
    public void registrarPago() {
   //Aqui vendria la logica para grabar en la base de datos
        System.out.println("------------------------------------------------------");
        Cliente miCliente = new Cliente("98393282", "Carlos", "Sanchez Londoño", "M", "csanchez@gmail.com");
        this.setCliente(miCliente);

        this.setValor(1200000); // Cualquier valor de una logica de negocio que aun no se tiene

        System.out.println("Pago en efectivo registrado en el sistema con exito.");
        System.out.println("Cliente: " + this.getCliente().toString());
        System.out.println("Valor: " + this.getValor());
  }

}