// CRIADOR CONCRETO - única classe que dá "new ApoliceAuto"
public class EmissorAuto extends EmissorApolice {

    private String segurado;
    private double valorFipe;
    private int idadeCondutor;
    private int anosHabilitacao;
    private double coberturaTerceiros;

    public EmissorAuto(String segurado, double valorFipe, int idadeCondutor, int anosHabilitacao, double coberturaTerceiros) {
        this.segurado = segurado;
        this.valorFipe = valorFipe;
        this.idadeCondutor = idadeCondutor;
        this.anosHabilitacao = anosHabilitacao;
        this.coberturaTerceiros = coberturaTerceiros;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceAuto(segurado, valorFipe, idadeCondutor, anosHabilitacao, coberturaTerceiros);
    }
}
