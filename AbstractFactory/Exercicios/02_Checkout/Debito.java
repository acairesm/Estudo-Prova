public class Debito implements ProcessamentoPagamento {

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via Débito Americano");
    }
    
}
