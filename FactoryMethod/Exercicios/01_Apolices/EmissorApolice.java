// CRIADOR (Creator) - CLASSE ABSTRATA
public abstract class EmissorApolice {

    // FACTORY METHOD: cada subclasse decide QUAL apólice criar.
    protected abstract Apolice criarApolice();

    // Algoritmo fixo (final = subclasse não pode mudar).
    // Só conhece "Apolice", nunca ApoliceAuto/ApoliceVida... e não tem if de tipo.
    public final String contratar() {
        Apolice apolice = criarApolice(); // chama a versão da SUBCLASSE

        if (!apolice.validarCobertura()) {
            return "Contratação REJEITADA: cobertura/documentação mínima não atendida.\n";
        }

        apolice.emitir();
        return apolice.gerarResumo();
    }
}
