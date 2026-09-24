public class EUAFactory implements CheckoutFactory {

    @Override
    public DocumentoFiscal documentoFiscal() {
        return new SalesInvoice();
    }

    @Override
    public ProcessamentoPagamento processamentoPagamento() {
        return new Debito();
    }

    @Override
    public EtiquetaEnvio etiquetaEnvio() {
        return new ubs();
    }

}
