// CRIADOR CONCRETO
public class LogisticaMaritima extends Logistica {

    @Override
    public iTransporte criarTransporte() {
        return new Navio();
    }
}
