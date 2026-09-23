// PRODUTO CONCRETO
public class Push implements iNotificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[PUSH] " + mensagem);
    }
}
