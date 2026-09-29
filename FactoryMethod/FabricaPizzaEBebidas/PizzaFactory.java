public class PizzaFactory implements DeliveryFactory {
    @Override
    public Comida criarComida() {
        return new Pizza();
    }

    @Override
    public Bebida criarBebida() {
        return new Refrigerante();
    }
}
