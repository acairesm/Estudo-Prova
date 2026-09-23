// CLIENTE
public class Main {

    // O "sistema" só depende da interface da fábrica.
    // Pode ser email, sms ou push: este método não muda.
    static void avisarUsuario(iFabricaNotificacao fabrica, String msg) {
        iNotificacao n = fabrica.criarNotificacao();
        n.enviar(msg);
    }

    public static void main(String[] args) {
        String preferencia = "sms"; // imagine que veio do cadastro do usuário

        // Escolhe a fábrica UMA vez, em tempo de execução
        iFabricaNotificacao fabrica;
        if (preferencia.equals("email"))    fabrica = new FabricaEmail();
        else if (preferencia.equals("sms")) fabrica = new FabricaSMS();
        else                                fabrica = new FabricaPush();

        avisarUsuario(fabrica, "Seu pedido foi enviado!");   // [SMS] ...

        // Array de fábricas: mesma chamada, produtos diferentes (polimorfismo)
        iFabricaNotificacao[] todas = { new FabricaEmail(), new FabricaSMS(), new FabricaPush() };
        for (iFabricaNotificacao f : todas) {
            avisarUsuario(f, "Promoção de hoje");
        }

        // Comparação: Simple Factory
        iNotificacao n = SimpleFactory.criar("email");
        n.enviar("criado pela Simple Factory");
    }
}
