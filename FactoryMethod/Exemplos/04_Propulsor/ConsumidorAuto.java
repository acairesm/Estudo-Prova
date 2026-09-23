// CLIENTE
public class ConsumidorAuto {
    public static void main(String[] args) {
        Auto fusca = new Auto(new FabricaCombustao()); // passa a fábrica, não o motor
        fusca.ligar();      // Acionando combustão: VRUM!
        fusca.desligar();

        Auto tesla = new Auto(new FabricaEletrico());
        tesla.ligar();      // Acionando elétrico: zzzz...
        tesla.desligar();

        // Novo motor (ex.: Hibrido)? Criar Hibrido implements iPropulsor
        // + FabricaHibrido implements iFabricaPropulsor. Auto NÃO muda.
    }
}
