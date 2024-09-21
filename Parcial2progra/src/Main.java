package pagos;

public class Tienda {
    public static void main(String[] args) {
        ProcesadorPagos procesador = new ProcesadorPagos();


        procesador.setMetodoPago(new PagoTarjetaCredito());
        procesador.procesar(100.0);


        procesador.setMetodoPago(new PagoPayPal());
        procesador.procesar(200.0);


        procesador.setMetodoPago(new PagoTransferencia());
        procesador.procesar(300.0);
    }
}
