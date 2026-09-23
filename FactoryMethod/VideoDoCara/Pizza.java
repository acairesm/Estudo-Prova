public class Pizza implements Comida {
    public Pizza() {
    }

    @Override
    public void removeIngrediente(String nome) {
        System.out.println("Removendo ingrediente: " + nome);
    }

    @Override
    public void escolheSemSal() {
        System.out.println("Escolhendo opção sem sal");
    }

}
