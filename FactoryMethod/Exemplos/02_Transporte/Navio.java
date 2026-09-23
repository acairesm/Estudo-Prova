// PRODUTO CONCRETO
public class Navio implements iTransporte {

    @Override
    public void entregar(String carga) {
        System.out.println("Navio entregando '" + carga + "' pelo MAR");
    }
}
