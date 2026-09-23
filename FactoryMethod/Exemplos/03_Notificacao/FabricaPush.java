// CRIADOR CONCRETO
public class FabricaPush implements iFabricaNotificacao {
    @Override
    public iNotificacao criarNotificacao() { return new Push(); }
}
