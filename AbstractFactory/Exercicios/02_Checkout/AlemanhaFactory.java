public class AlemanhaFactory implements CheckoutFactory {

    @Override
    public DocumentoFiscal documentoFiscal() {
        return new VatInvoice();
    }

    @Override
    public ProcessamentoPagamento processamentoPagamento() {
        return new Credito();
    }

    @Override
    public EtiquetaEnvio etiquetaEnvio() {
        return new DeustschetPost();
    }

}
