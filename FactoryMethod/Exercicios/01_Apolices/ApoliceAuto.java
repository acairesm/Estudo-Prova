import java.util.List;

// PRODUTO CONCRETO - RF01
public class ApoliceAuto extends Apolice {

    private final double valorFipe;
    private int idadeCondutor;
    private int anosHabilitacao;
    private double coberturaTerceiros;

    public ApoliceAuto(String segurado, double valorFipe, int idadeCondutor,
                       int anosHabilitacao, double coberturaTerceiros) {
        super(segurado);
        this.valorFipe = valorFipe;
        this.idadeCondutor = idadeCondutor;
        this.anosHabilitacao = anosHabilitacao;
        this.coberturaTerceiros = coberturaTerceiros;
    }

    public ApoliceAuto(int anosHabilitacao, double coberturaTerceiros, int idadeCondutor, double valorFipe, String segurado) {
        super(segurado);
        this.anosHabilitacao = anosHabilitacao;
        this.coberturaTerceiros = coberturaTerceiros;
        this.idadeCondutor = idadeCondutor;
        this.valorFipe = valorFipe;
    }

    public ApoliceAuto(double valorFipe, String segurado) {
        super(segurado);
        this.valorFipe = valorFipe;
    }

    @Override
    public double calcularPremio() {
        double anual = valorFipe * 0.08;
        if (idadeCondutor < 25) anual *= 1.30;   // +30%
        if (anosHabilitacao < 2) anual *= 1.20;  // +20% adicional (em cima do valor já acrescido)
        return anual / 12;                       // mensal
    }

    @Override
    public boolean validarCobertura() {
        return coberturaTerceiros >= 50000;
    }

    @Override
    public List<String> documentos() {
        return List.of("CNH", "CRLV", "Comprovante de residência");
    }

    @Override
    protected String prefixo() { return "AUTO"; }
}
