public class ApoliceViagemFactory implements ApoliceFactory {
    @Override
    public ChekoutApolice criarApolice() {
        return new ApoliceViagem(15, true, 50000, true);
    }

}
