// PRODUTO CONCRETO (ConcreteProduct)
// "implements iForma" = assina o contrato, é obrigado a implementar desenhar().
public class Circulo implements iForma {

    @Override // indica que está implementando o método da interface
    public void desenhar() {
        System.out.println("Desenhando um CÍRCULO");
    }
}
