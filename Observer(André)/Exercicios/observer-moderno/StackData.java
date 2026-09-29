import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class StackData {
    public final List<BiConsumer<String, Double>> observers = new ArrayList<>();
    
    public void addObserver(BiConsumer<String, Double> observer) {
        observers.add(observer);
    }

    public void removeObserver(BiConsumer<String, Double> observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String name, Double preco) {
        for (BiConsumer<String, Double> observer : observers) {
            observer.accept(name, preco);
        }
    }


}
