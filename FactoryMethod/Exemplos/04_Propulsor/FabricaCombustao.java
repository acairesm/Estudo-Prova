// CRIADOR CONCRETO
public class FabricaCombustao implements iFabricaPropulsor {
    @Override
    public iPropulsor criarPropulsor() { return new Combustao(); }
}
