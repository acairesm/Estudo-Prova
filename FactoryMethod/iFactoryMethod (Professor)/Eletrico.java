public class Eletrico implements iPropulsor {

    @Override
    public void acionar() {
        System.out.println("Acionando elétrico");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando elétrico");
    }
    
}
