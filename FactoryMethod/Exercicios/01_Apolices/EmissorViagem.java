// CRIADOR CONCRETO - única classe que dá "new ApoliceViagem"
public class EmissorViagem extends EmissorApolice {

    private String segurado;
    private int dias;
    private boolean internacional;
    private double coberturaMedicaUsd;
    private boolean temPassaporte;

    public EmissorViagem(String segurado, int dias, boolean internacional, double coberturaMedicaUsd, boolean temPassaporte) {
        this.segurado = segurado;
        this.dias = dias;
        this.internacional = internacional;
        this.coberturaMedicaUsd = coberturaMedicaUsd;
        this.temPassaporte = temPassaporte;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceViagem(segurado, dias, internacional, coberturaMedicaUsd, temPassaporte);
    }
}
