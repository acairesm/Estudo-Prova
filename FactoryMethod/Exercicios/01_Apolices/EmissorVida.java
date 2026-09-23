// CRIADOR CONCRETO - única classe que dá "new ApoliceVida"
public class EmissorVida extends EmissorApolice {

    private String segurado;
    private int idade;
    private double capitalSegurado;
    private boolean fumante;
    private boolean temAtestado;

    public EmissorVida(String segurado, int idade, double capitalSegurado, boolean fumante, boolean temAtestado) {
        this.segurado = segurado;
        this.idade = idade;
        this.capitalSegurado = capitalSegurado;
        this.fumante = fumante;
        this.temAtestado = temAtestado;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceVida(segurado, idade, capitalSegurado, fumante, temAtestado);
    }
}
