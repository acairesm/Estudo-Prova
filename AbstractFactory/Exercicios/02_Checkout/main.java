public class main {
    public static void main(String[] args) {
        // ESCOLHA DO PAÍS: deixe só UMA das três linhas abaixo sem "//".
        // É o único lugar que conhece a fábrica concreta.
        //
        //   BrasilFactory   -> NFE          + Pix     + Correios
        //   AlemanhaFactory -> VatInvoice   + Credito + DeustschetPost
        //   EUAFactory      -> SalesInvoice + Debito  + ubs
        //
        // A variável é do tipo da interface (CheckoutFactory), então aceita qualquer uma das três.
        // CheckoutFactory checkoutFactory = new BrasilFactory();
        CheckoutFactory checkoutFactory = new AlemanhaFactory();
        // CheckoutFactory checkoutFactory = new EUAFactory();

        // Pede os produtos à fábrica. O código não sabe (nem precisa saber) qual classe concreta veio:
        // só enxerga as interfaces. A fábrica garante que os três são do mesmo país.
        DocumentoFiscal documentoFiscal = checkoutFactory.documentoFiscal();                 // Brasil: NFE          | Alemanha: VatInvoice | EUA: SalesInvoice
        ProcessamentoPagamento processamentoPagamento = checkoutFactory.processamentoPagamento(); // Brasil: Pix          | Alemanha: Credito    | EUA: Debito
        EtiquetaEnvio etiquetaEnvio = checkoutFactory.etiquetaEnvio();                       // Brasil: Correios     | Alemanha: DeustschetPost | EUA: ubs

        // Usa os produtos. Saída de cada país:
        //
        //   Brasil:
        //     Emitindo nota fiscal eletrônica
        //     Processando pagamento via Pix
        //     Gerando etiqueta de envio pelos Correios
        //
        //   Alemanha:
        //     Emitindo nota fiscal de imposto sobre valor agregado
        //     Processando pagamento via Crédito alemão
        //     Gerando etiqueta de envio pela Deutsche Post ingles
        //
        //   EUA:
        //     Emitindo nota fiscal de venda
        //     Processando pagamento via Débito Americano
        //     Gerando etiqueta de envio pelos Correios ingles
        documentoFiscal.emitirNotaFiscal();
        processamentoPagamento.processarPagamento();
        etiquetaEnvio.gerarEtiquetaEnvio();

        // Alternativa: deixar o Cliente fazer tudo isso (mesmos produtos, mas ele processa o pagamento primeiro):
        // new Cliente(new BrasilFactory()).finalizarCompra();
    }

}
