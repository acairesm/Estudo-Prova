public class Cliente {
    private CheckoutFactory factory;

    public Cliente(CheckoutFactory factory) {
        this.factory = factory;
    }

    public Cliente() {
    }

    public void finalizarCompra() {
        DocumentoFiscal doc = factory.documentoFiscal();
        ProcessamentoPagamento pag = factory.processamentoPagamento();
        EtiquetaEnvio etiqueta = factory.etiquetaEnvio();

        pag.processarPagamento();
        doc.emitirNotaFiscal();
        etiqueta.gerarEtiquetaEnvio();
    }
}
