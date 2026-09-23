import java.util.HashMap;
import java.util.Map;

// CLIENTE
// Escolhe o emissor pelo TIPO usando um Map (sem if/switch).
// Nunca dá "new ApoliceX" -> só conhece EmissorApolice.
public class Cliente {

    private Map<String, EmissorApolice> emissores = new HashMap<>();

    public void registrar(String tipo, EmissorApolice emissor) {
        emissores.put(tipo, emissor);
    }

    public void emitir(String tipo) {
        System.out.println("=== Pedido: " + tipo + " ===");
        System.out.println(emissores.get(tipo).contratar());
    }
}
