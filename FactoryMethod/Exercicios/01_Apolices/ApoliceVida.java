import java.util.ArrayList;
import java.util.List;

// PRODUTO CONCRETO - RF03
public class ApoliceVida extends Apolice {

    private int idade;
    private double capitalSegurado;
    private boolean fumante;
    private boolean temAtestado;

    public ApoliceVida(String segurado, int idade, double capitalSegurado,
                       boolean fumante, boolean temAtestado) {
        super(segurado);
        this.idade = idade;
        this.capitalSegurado = capitalSegurado;
        this.fumante = fumante;
        this.temAtestado = temAtestado;
    }

    private boolean exigeAtestado() {
        return capitalSegurado > 500000;
    }

    @Override
    public double calcularPremio() {
        double mensal = (idade * 12) + (capitalSegurado * 0.002);
        if (fumante) mensal *= 1.50; // +50%
        return mensal;
    }

    @Override
    public boolean validarCobertura() {
        return !exigeAtestado() || temAtestado; // capital alto sem atestado = rejeita
    }

    @Override
    public List<String> documentos() {
        List<String> docs = new ArrayList<>(List.of("Documento de identidade", "CPF"));
        if (exigeAtestado()) docs.add("Atestado médico");
        return docs;
    }

    @Override
    protected String prefixo() { return "VID"; }
}
