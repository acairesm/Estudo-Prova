public class main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        // Contratando apólice de vida
        ApoliceFactory vidaFactory = new VidaFactory();
        cliente.contratarApolice(vidaFactory);

        // Contratando apólice residencial
        ApoliceFactory residencialFactory = new ResidencialFactory();
        cliente.contratarApolice(residencialFactory);

        // Contratando apólice de viagem
        ApoliceFactory viagemFactory = new ApoliceViagemFactory();
        cliente.contratarApolice(viagemFactory);

        ApoliceFactory ApoliceAuto = new ApoliceAutoFactory();
        cliente.contratarApolice(ApoliceAuto);

    }

}
