public class consumidor_auto {
    public static void main(String[] args) {
        Auto abc2 = new Auto(new Combustao());
        abc2.propulsor.acionar();
        abc2.propulsor.desligar();
    }
    
}
