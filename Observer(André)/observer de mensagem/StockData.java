import java.util.ArrayList;
import java.util.List;

public class StockData {
    public List<Observer> observers = new ArrayList<>();
    public String name;
    public Double preco;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }


    public void notifyObservers(String name, Double preco) {
       this.name = name;
       this.preco = preco;
       notifyAllObservers();
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(name, preco);
        }
    } 

}
