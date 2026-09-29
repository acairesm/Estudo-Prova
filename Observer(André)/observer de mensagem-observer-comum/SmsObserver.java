public class SmsObserver implements Observer {
    @Override
    public void update(String name, Double preco) {
        System.out.println("Enviando SMS para o cliente: Produto: " + name + " Preço: " + preco);
    }
    
}
