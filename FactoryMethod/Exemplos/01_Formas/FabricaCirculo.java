// CRIADOR CONCRETO (ConcreteCreator)
// Única classe que sabe dar "new Circulo()".
public class FabricaCirculo implements iFabricaForma {

    @Override
    public iForma criarForma() {
        return new Circulo(); // cria o objeto concreto e devolve como iForma (polimorfismo)
    }
}
