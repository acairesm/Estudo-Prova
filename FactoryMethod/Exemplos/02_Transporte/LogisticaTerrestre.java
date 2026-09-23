// CRIADOR CONCRETO - "extends" porque o pai é classe (abstrata), não interface
public class LogisticaTerrestre extends Logistica {

    @Override
    public iTransporte criarTransporte() {
        return new Caminhao();
    }
}
