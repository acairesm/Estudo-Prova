// CRIADOR CONCRETO
public class FabricaEmail implements iFabricaNotificacao {
    @Override
    public iNotificacao criarNotificacao() { return new Email(); }
}
