// PRODUTO CONCRETO
public class Caminhao implements iTransporte {

    @Override
    public void entregar(String carga) {
        System.out.println("Caminhão entregando '" + carga + "' por ESTRADA");
    }
}
