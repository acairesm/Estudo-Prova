public class ApoliceAuto implements ChekoutApolice {

    // Dados que só a apólice de automóvel tem
    private double valorFipe;
    private int idade;
    private int tempoHabilitacao;
    private double coberturaTerceiros;

    public ApoliceAuto(double valorFipe, int idade, int tempoHabilitacao, double coberturaTerceiros) {
        this.valorFipe = valorFipe;
        this.idade = idade;
        this.tempoHabilitacao = tempoHabilitacao;
        this.coberturaTerceiros = coberturaTerceiros;

    }

    @Override
    public double calcularPremio() {
        double premio = valorFipe * 0.08; // 8% do valor FIPE (anual)

        if (idade < 25) {
            premio *= 1.30; // +30% para condutores com menos de 25 anos
        }

        if (tempoHabilitacao < 2) {
            premio *= 1.20; // +20% para menos de 2 anos de habilitação
        }

        return premio / 12; // mensal
    }

    @Override
    public boolean validacaoCobertura() {

        if (valorFipe < 50000) {
            System.out.println("Cobertura mínima não atendida. Contratação rejeitada.");
        } else {
            System.out.println("Cobertura válida para contratação.");
        }

        return coberturaTerceiros >= 10000;

    }

    @Override
    public void listagemDocumento() {
        System.out.println("Listando documentos necessários para apólice de automóvel:");
        System.out.println("- CNH do condutor");
        System.out.println("- CRLV do veículo");
        System.out.println("- Comprovante de residência");
    }

    @Override
    public void geracaoResumo() {
        System.out.println("Resumo da apólice de automóvel:");
        System.out.println("- Valor FIPE: " + valorFipe);
        System.out.println("- Idade do condutor: " + idade);
        System.out.println("- Tempo de habilitação: " + tempoHabilitacao + " anos");
        System.out.println("- Prêmio mensal: " + calcularPremio());

    }

}
