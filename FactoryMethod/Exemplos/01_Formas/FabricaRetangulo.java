// CRIADOR CONCRETO (ConcreteCreator)
public class FabricaRetangulo implements iFabricaForma {

    @Override
    public iForma criarForma() {
        return new Retangulo();
    }
}
