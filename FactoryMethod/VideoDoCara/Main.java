public class Main {
    public static void main(String[] args) {
        DeliveryFactory factory = new HamburugerFactory();
        Comida comida = factory.criarComida();
        Bebida bebida = factory.criarBebida();

        comida.removeIngrediente("Alface");
        comida.removeIngrediente("Tomate");
        comida.escolheSemSal();
        bebida.escolheSemAcucar();
    }
}
