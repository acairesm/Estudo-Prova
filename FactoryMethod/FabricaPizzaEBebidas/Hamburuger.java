public class Hamburuger implements Comida {
    public Hamburuger() {
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
