public class VidaFactory implements ApoliceFactory {
    @Override
    public ChekoutApolice criarApolice() {
        return new ApoliceVida(100000, 30, true, true);
    }

}
