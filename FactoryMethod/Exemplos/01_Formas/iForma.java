// PRODUTO (Product)
// Interface que define o que TODA forma sabe fazer.
// O cliente só conhece este tipo, nunca Circulo ou Retangulo diretamente.
public interface iForma {
    void desenhar(); // método abstrato (em interface é public abstract por padrão)
}
