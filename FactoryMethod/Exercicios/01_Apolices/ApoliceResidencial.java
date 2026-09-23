import java.util.List;

// PRODUTO CONCRETO - RF02
public class ApoliceResidencial extends Apolice {

    private double valorImovel;
    private boolean altoPadrao;
    private boolean temEscrituraOuContrato;

    public ApoliceResidencial(String segurado, double valorImovel, boolean altoPadrao,
                              boolean temEscrituraOuContrato) {
        super(segurado);
        this.valorImovel = valorImovel;
        this.altoPadrao = altoPadrao;
        this.temEscrituraOuContrato = temEscrituraOuContrato;
    }

    @Override
    public double calcularPremio() {
        double anual = valorImovel * 0.015;
        if (altoPadrao) anual *= 1.25; // +25%
        return anual / 12;
    }

    @Override
    public boolean validarCobertura() {
        return temEscrituraOuContrato;
    }

    @Override
    public List<String> documentos() {
        return List.of("Escritura ou contrato de locação", "Comprovante de residência");
    }

    @Override
    protected String prefixo() { return "RES"; }
}
