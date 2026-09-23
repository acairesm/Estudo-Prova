// CRIADOR CONCRETO
public class FabricaEletrico implements iFabricaPropulsor {
    @Override
    public iPropulsor criarPropulsor() { return new Eletrico(); }
}
