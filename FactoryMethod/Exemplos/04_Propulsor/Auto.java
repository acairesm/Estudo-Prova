// Classe que USA o produto. Ela não sabe se o motor é elétrico ou a combustão.
public class Auto {

    private iPropulsor propulsor; // atributo do tipo INTERFACE (encapsulado com private)

    // Construtor recebe a FÁBRICA e pede pra ela criar o propulsor
    public Auto(iFabricaPropulsor fabrica) {
        this.propulsor = fabrica.criarPropulsor(); // this = o próprio objeto Auto
    }

    public void ligar()    { propulsor.acionar(); }  // delega pro propulsor
    public void desligar() { propulsor.desligar(); }
}
