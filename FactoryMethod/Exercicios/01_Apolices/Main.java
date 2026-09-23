// TESTE: emite uma apólice de cada linha + alguns casos rejeitados.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        //                                   segurado  FIPE    idade hab cob.terceiros
        cliente.registrar("auto",  new EmissorAuto("Ana", 60000, 22, 1, 100000));
        //                                                 valor   altoPadrao escritura
        cliente.registrar("residencial", new EmissorResidencial("Bruno", 400000, true, true));
        //                                          idade capital fumante atestado
        cliente.registrar("vida",  new EmissorVida("Carla", 40, 300000, true, false));
        //                                             dias internac. cob.USD passaporte
        cliente.registrar("viagem", new EmissorViagem("Diego", 10, true, 50000, true));

        // Casos que devem ser REJEITADOS:
        cliente.registrar("auto-sem-cobertura", new EmissorAuto("Edu", 50000, 30, 5, 20000));
        cliente.registrar("vida-sem-atestado",  new EmissorVida("Fabi", 50, 800000, false, false));
        cliente.registrar("viagem-sem-passaporte", new EmissorViagem("Gil", 7, true, 40000, false));

        cliente.emitir("auto");
        cliente.emitir("residencial");
        cliente.emitir("vida");
        cliente.emitir("viagem");
        cliente.emitir("auto-sem-cobertura");
        cliente.emitir("vida-sem-atestado");
        cliente.emitir("viagem-sem-passaporte");
    }
}
