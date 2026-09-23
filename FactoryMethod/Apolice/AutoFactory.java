public class AutoFactory implements ApoliceFactory {
    @Override
    public ChekoutApolice criarApolice() {
        return new ApoliceAuto(10000, 25, 2, 10000);
    }

}
