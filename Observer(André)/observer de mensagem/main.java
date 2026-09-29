public class main {
    public static void main(String[] args) {
        StockData stockData = new StockData();
        Observer smsObserver = new SmsObserver();
        Observer consoleObserver = new ConsoleObserver();
        Observer emailObserver = new EmailObserver();

        stockData.addObserver(smsObserver);
        stockData.addObserver(consoleObserver);
        stockData.removeObserver(emailObserver);

        stockData.notifyObservers("Produto A", 10.0);
        stockData.notifyObservers("Produto B", 20.0);
    }


}
