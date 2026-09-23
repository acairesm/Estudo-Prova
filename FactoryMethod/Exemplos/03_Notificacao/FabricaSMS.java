// CRIADOR CONCRETO
public class FabricaSMS implements iFabricaNotificacao {
    @Override
    public iNotificacao criarNotificacao() { return new SMS(); }
}
