// CRIADOR (Creator) - CLASSE ABSTRATA
// Não pode ser instanciada (new Logistica() dá erro).
public abstract class Logistica {

    // FACTORY METHOD: abstrato, sem corpo.
    // Cada subclasse é OBRIGADA a implementar e decidir qual transporte criar.
    public abstract iTransporte criarTransporte();

    // Método CONCRETO (já implementado) que as subclasses herdam.
    // Ele usa o factory method sem saber qual transporte vai vir.
    public void planejarEntrega(String carga) {
        System.out.println("-- Planejando entrega --");
        iTransporte t = criarTransporte(); // chama a versão da SUBCLASSE (polimorfismo)
        t.entregar(carga);
    }
}
