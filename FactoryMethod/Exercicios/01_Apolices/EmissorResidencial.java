// CRIADOR CONCRETO - única classe que dá "new ApoliceResidencial"
public class EmissorResidencial extends EmissorApolice {

    private String segurado;
    private double valorImovel;
    private boolean altoPadrao;
    private boolean temEscrituraOuContrato;

    public EmissorResidencial(String segurado, double valorImovel, boolean altoPadrao, boolean temEscrituraOuContrato) {
        this.segurado = segurado;
        this.valorImovel = valorImovel;
        this.altoPadrao = altoPadrao;
        this.temEscrituraOuContrato = temEscrituraOuContrato;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceResidencial(segurado, valorImovel, altoPadrao, temEscrituraOuContrato);
    }
}
