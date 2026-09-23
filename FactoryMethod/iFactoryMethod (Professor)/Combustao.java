public class Combustao implements iPropulsor {

    @Override
    public void acionar() {
        System.out.println("Acionando combustão");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando combustão");
    }
}


