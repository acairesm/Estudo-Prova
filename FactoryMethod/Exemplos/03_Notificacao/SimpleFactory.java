// SIMPLE FACTORY (NÃO é o Factory Method do GoF! Só pra comparar na prova)
// Uma classe só, com if/switch. Mais simples, porém a cada tipo novo
// é preciso ALTERAR esta classe -> viola o princípio Aberto/Fechado.
public class SimpleFactory {

    public static iNotificacao criar(String tipo) {
        switch (tipo) {
            case "email": return new Email();
            case "sms":   return new SMS();
            case "push":  return new Push();
            default: throw new IllegalArgumentException("Tipo desconhecido: " + tipo);
        }
    }
}
