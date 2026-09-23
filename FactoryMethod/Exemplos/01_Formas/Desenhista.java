// CLIENTE (Client)
// Usa só as INTERFACES: iFabricaForma e iForma.
// Não existe nenhum "new Circulo()" aqui -> baixo acoplamento.
public class Desenhista {

    // Método que recebe QUALQUER fábrica. Não sabe (nem precisa saber) qual forma vai sair.
    static void desenharCom(iFabricaForma fabrica) {
        iForma forma = fabrica.criarForma(); // pede pra fábrica criar
        forma.desenhar();                    // usa o produto pela interface
    }

    public static void main(String[] args) {
        // 1) Escolhe as fábricas (único ponto onde aparece classe concreta)
        iFabricaForma fabricaCirculo   = new FabricaCirculo();
        iFabricaForma fabricaRetangulo = new FabricaRetangulo();

        // 2) Pede as formas às fábricas
        iForma circulo = fabricaCirculo.criarForma();
        circulo.desenhar();     // Desenhando um CÍRCULO

        iForma retangulo = fabricaRetangulo.criarForma();
        retangulo.desenhar();   // Desenhando um RETÂNGULO

        // 3) Mesmo método, fábricas diferentes = resultados diferentes (polimorfismo)
        desenharCom(new FabricaCirculo());
        desenharCom(new FabricaRetangulo());

        // Pra adicionar Triangulo: criar Triangulo implements iForma
        // + FabricaTriangulo implements iFabricaForma. NADA acima muda (Aberto/Fechado).
    }
}
