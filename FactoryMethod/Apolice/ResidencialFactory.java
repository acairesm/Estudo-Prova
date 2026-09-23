public class ResidencialFactory implements ApoliceFactory {
    @Override
    public ChekoutApolice criarApolice() {
        return new ApoliceResidencial(500000, 30, 1, 10000);
    }

}
