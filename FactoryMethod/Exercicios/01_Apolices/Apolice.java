import java.time.LocalDate;
import java.util.List;

// PRODUTO (Product) - CLASSE ABSTRATA
// Tudo que TODA apólice tem em comum. As regras de cada uma ficam nas subclasses.
public abstract class Apolice {

    private static int contador = 0; // compartilhado por todas -> número único (RNF02)

    protected String segurado;
    private String numero;
    private LocalDate dataEmissao;

    public Apolice(String segurado) {
        this.segurado = segurado;
    }

    // Cada linha de produto implementa do seu jeito:
    public abstract double calcularPremio();
    public abstract boolean validarCobertura();
    public abstract List<String> documentos();
    protected abstract String prefixo(); // "AUTO", "RES", "VID", "VIA"

    // Só chamado se passou na validação: dá número e data.
    public void emitir() {
        contador++;
        numero = prefixo() + "-" + contador;
        dataEmissao = LocalDate.now();
    }

    // Resumo padrão (RNF03) - igual pra todas.
    public String gerarResumo() {
        return String.format(
            "Apólice: %s%nSegurado: %s%nEmissão: %s%nPrêmio: R$ %.2f%nDocumentos: %s%n",
            numero, segurado, dataEmissao, calcularPremio(), documentos());
    }
}
