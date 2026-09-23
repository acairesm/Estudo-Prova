public class desenhista {
    public static void main(String[] args) {
        //Construir a fábridesejada
        iFabricaForma fabricaCirculo = new FabricaCirculo() ;
        iFabricaForma fabricaRetangulo = new FabricaRetangulo();
        /* 
        Blocos de código relativos ao conteto */

        //Quando necessitar do círculo
        iForma circulo = fabricaCirculo.criarForma();
        circulo.desenhar();

        iForma retangulo = fabricaRetangulo.criarForma();
        retangulo.desenhar();

    }
}
