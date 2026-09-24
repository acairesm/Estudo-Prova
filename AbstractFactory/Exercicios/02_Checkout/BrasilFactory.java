public class BrasilFactory implements CheckoutFactory {

    @Override
    public DocumentoFiscal documentoFiscal() {
        return new NFE();
    }

    @Override
    public ProcessamentoPagamento processamentoPagamento() {
        return new Pix();
    }

    @Override
    public EtiquetaEnvio etiquetaEnvio() {
        return new Correios();
    }

}
