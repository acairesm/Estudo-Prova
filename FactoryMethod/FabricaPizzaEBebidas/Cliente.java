public class Cliente {

    public DeliveryFactory factory;

    public Cliente(DeliveryFactory factory) {
        this.factory = factory;
    }

    public void criarPedido() {
        Comida comida = factory.criarComida();
        Bebida bebida = factory.criarBebida();

        comida.removeIngrediente("Tomate");
        bebida.escolheSemAcucar();
    }

}
