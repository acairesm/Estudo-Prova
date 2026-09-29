public class ConsoleObserver  implements Observer {
    @Override
    public void update(String name, Double preco) {
        System.out.println("Produto: " + name + " Preço: " + preco);
    }
     
}
