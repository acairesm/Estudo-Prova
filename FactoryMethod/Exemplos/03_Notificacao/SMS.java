// PRODUTO CONCRETO
public class SMS implements iNotificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[SMS] " + mensagem);
    }
}
