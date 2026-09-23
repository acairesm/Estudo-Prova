public class ApoliceVida implements ChekoutApolice {

    // Dados que só a apólice de vida tem
    private int idade;
    private double capitalSegurado;
    private boolean fumante;
    private boolean temAtestado;

    public ApoliceVida(int idade, double capitalSegurado, boolean fumante, boolean temAtestado) {
        this.idade = idade;
        this.capitalSegurado = capitalSegurado;
        this.fumante = fumante;
        this.temAtestado = temAtestado;
    }

    // Capital acima de R$ 500.000 exige atestado médico
    private boolean exigeAtestado() {
        return capitalSegurado > 500000;
    }

    @Override
    public double calcularPremio() {
        double premio = (idade * 12) + (capitalSegurado * 0.002); // já é mensal

        if (fumante) {
            premio *= 1.50; // +50% para fumantes
        }

        return premio;
    }

    @Override
    public boolean validacaoCobertura() {
        boolean valida = !exigeAtestado() || temAtestado;

        if (!valida) {
            System.out.println("Capital acima de R$ 500.000 sem atestado médico. Contratação rejeitada.");
        } else {
            System.out.println("Cobertura válida para contratação.");
        }

        return valida;
    }

    @Override
    public void listagemDocumento() {
        System.out.println("Listando documentos necessários para apólice de vida:");
        System.out.println("- Documento de identidade");
        System.out.println("- CPF");
        if (exigeAtestado()) {
            System.out.println("- Atestado médico");
        }
    }

    @Override
    public void geracaoResumo() {
        System.out.println("Resumo da apólice de vida:");
        System.out.println("- Idade do segurado: " + idade);
        System.out.println("- Capital segurado: " + capitalSegurado);
        System.out.println("- Fumante: " + (fumante ? "Sim" : "Não"));
        System.out.println("- Prêmio mensal: " + calcularPremio());
    }

}
