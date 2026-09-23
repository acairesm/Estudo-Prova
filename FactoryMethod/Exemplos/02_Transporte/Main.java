// CLIENTE
public class Main {
    public static void main(String[] args) {
        // Variável do tipo ABSTRATO, objeto CONCRETO
        Logistica logistica = new LogisticaTerrestre();
        logistica.planejarEntrega("Geladeira");   // Caminhão entregando ...

        // Troca só a fábrica; o resto do código é igual
        logistica = new LogisticaMaritima();
        logistica.planejarEntrega("Contêiner");   // Navio entregando ...

        // Logistica x = new Logistica(); // ERRO: classe abstrata não pode ser instanciada
    }
}
