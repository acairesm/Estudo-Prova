public class EmailObserver  implements Observer {
    @Override
    public void update(String name, Double preco) {
        System.out.println("Enviando email para o cliente: Produto: " + name + " Preço: " + preco);
    }
    
}
