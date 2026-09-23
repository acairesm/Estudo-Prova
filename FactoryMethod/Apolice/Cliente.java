public class Cliente {
    public void contratarApolice(ApoliceFactory factory) {
        ChekoutApolice apolice = factory.criarApolice();
        apolice.calcularPremio();
        apolice.validacaoCobertura();
        apolice.listagemDocumento();
        apolice.geracaoResumo();
    }
    
}
