
public class ApoliceAutoFactory implements ApoliceFactory {
    @Override
    public ChekoutApolice criarApolice() {
        return new ApoliceAuto(20000, 30, 2, 10000);
    }

}
