package pagos;

    public class ProcesadorPagos {
        private MetodoPago metodoPago;


        public void setMetodoPago(MetodoPago metodoPago) {
            this.metodoPago = metodoPago;
        }

        public void procesar(double monto) {
            if (metodoPago == null) {
                throw new IllegalStateException("Método de pago no seleccionado.");
            }
            metodoPago.procesarPago(monto);
        }
    }

}
