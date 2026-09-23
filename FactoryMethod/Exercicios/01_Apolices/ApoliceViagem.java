import java.util.ArrayList;
import java.util.List;

// PRODUTO CONCRETO - RF04
public class ApoliceViagem extends Apolice {

    private int dias;
    private boolean internacional;
    private double coberturaMedicaUsd;
    private boolean temPassaporte;

    public ApoliceViagem(String segurado, int dias, boolean internacional,
                         double coberturaMedicaUsd, boolean temPassaporte) {
        super(segurado);
        this.dias = dias;
        this.internacional = internacional;
        this.coberturaMedicaUsd = coberturaMedicaUsd;
        this.temPassaporte = temPassaporte;
    }

    @Override
    public double calcularPremio() {
        double premio = dias * 15.0;
        if (internacional) premio += 100;
        return premio;
    }

    @Override
    public boolean validarCobertura() {
        if (!internacional) return true; // nacional não tem exigência
        return coberturaMedicaUsd >= 30000 && temPassaporte;
    }

    @Override
    public List<String> documentos() {
        List<String> docs = new ArrayList<>(List.of("Itinerário de viagem"));
        if (internacional) docs.add("Passaporte");
        return docs;
    }

    @Override
    protected String prefixo() { return "VIA"; }
}
