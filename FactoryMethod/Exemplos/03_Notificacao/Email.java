// PRODUTO CONCRETO
public class Email implements iNotificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[EMAIL] " + mensagem);
    }
}
