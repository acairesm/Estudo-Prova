// CRIADOR (Creator)
// Interface da fábrica. Declara o FACTORY METHOD: criarForma().
// Repare que o retorno é iForma (a interface), e não Circulo/Retangulo.
// Quem decide QUAL forma nasce é a fábrica concreta.
public interface iFabricaForma {
    iForma criarForma(); // <-- ESTE é o "factory method"
}
