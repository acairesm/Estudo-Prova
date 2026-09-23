public class ApoliceResidencial implements ChekoutApolice {

    // Dados que só a apólice residencial tem
    private double valorImovel;
    private boolean altoPadrao;
    private boolean temEscrituraOuContrato;

    public ApoliceResidencial(double valorImovel, boolean altoPadrao, boolean temEscrituraOuContrato) {
        this.valorImovel = valorImovel;
        this.altoPadrao = altoPadrao;
        this.temEscrituraOuContrato = temEscrituraOuContrato;
    }

    public ApoliceResidencial(double valorImovel, int idade, int tempoHabilitacao, double coberturaTerceiros) {
        this.valorImovel = valorImovel;
        this.altoPadrao = idade > 30; // Exemplo de lógica para determinar se é alto padrão
        this.temEscrituraOuContrato = tempoHabilitacao > 1; // Exemplo de lógica para determinar se tem escritura ou contrato
    }

    @Override
    public double calcularPremio() {
        double premio = valorImovel * 0.015; // 1,5% do valor do imóvel (anual)

        if (altoPadrao) {
            premio *= 1.25; // +25% para imóveis de alto padrão
        }

        return premio / 12; // mensal
    }

    @Override
    public boolean validacaoCobertura() {

        if (!temEscrituraOuContrato) {
            System.out.println("Sem escritura ou contrato de locação. Contratação rejeitada.");
        } else {
            System.out.println("Cobertura válida para contratação.");
        }

        return temEscrituraOuContrato;
    }

    @Override
    public void listagemDocumento() {
        System.out.println("Listando documentos necessários para apólice residencial:");
        System.out.println("- Escritura ou contrato de locação");
        System.out.println("- Comprovante de residência");
    }

    @Override
    public void geracaoResumo() {
        System.out.println("Resumo da apólice residencial:");
        System.out.println("- Valor do imóvel: " + valorImovel);
        System.out.println("- Alto padrão: " + (altoPadrao ? "Sim" : "Não"));
        System.out.println("- Prêmio mensal: " + calcularPremio());
    }

}
