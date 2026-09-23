public class ApoliceViagem implements ChekoutApolice {

    // Dados que só a apólice de viagem tem
    private int dias;
    private boolean internacional;
    private double coberturaMedicaUsd;
    private boolean temPassaporte;

    public ApoliceViagem(int dias, boolean internacional, double coberturaMedicaUsd, boolean temPassaporte) {
        this.dias = dias;
        this.internacional = internacional;
        this.coberturaMedicaUsd = coberturaMedicaUsd;
        this.temPassaporte = temPassaporte;
    }

    @Override
    public double calcularPremio() {
        double premio = dias * 15.0; // R$ 15,00 por dia

        if (internacional) {
            premio += 100; // + R$ 100,00 fixo (aqui é valor, não porcentagem)
        }

        return premio;
    }

    @Override
    public boolean validacaoCobertura() {
        // Viagem nacional não tem exigência
        boolean valida = !internacional || (coberturaMedicaUsd >= 30000 && temPassaporte);

        if (!valida) {
            System.out.println("Viagem internacional exige cobertura médica de US$ 30.000 e passaporte. Contratação rejeitada.");
        } else {
            System.out.println("Cobertura válida para contratação.");
        }

        return valida;
    }

    @Override
    public void listagemDocumento() {
        System.out.println("Listando documentos necessários para apólice de viagem:");
        System.out.println("- Itinerário de viagem");
        if (internacional) {
            System.out.println("- Passaporte");
        }
    }

    @Override
    public void geracaoResumo() {
        System.out.println("Resumo da apólice de viagem:");
        System.out.println("- Dias de viagem: " + dias);
        System.out.println("- Internacional: " + (internacional ? "Sim" : "Não"));
        System.out.println("- Prêmio: " + calcularPremio());
    }

}
