// PRODUTO CONCRETO
public class Combustao implements iPropulsor {
    @Override
    public void acionar()  { System.out.println("Acionando combustão: VRUM!"); }

    @Override
    public void desligar() { System.out.println("Desligando combustão"); }
}
