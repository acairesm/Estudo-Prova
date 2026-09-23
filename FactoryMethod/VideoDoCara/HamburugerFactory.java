public class HamburugerFactory implements DeliveryFactory {
    @Override
    public Comida criarComida() {
        return new Hamburuger();
    }

    @Override
    public Bebida criarBebida() {
        return new MilkShake();
    }

}
