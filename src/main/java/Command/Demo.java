package Command;

public class Demo {
    public static void run() {
        Stock stock1 = new Stock("aapl", 10);
        Stock stock2 = new Stock("goog", 15);

        Order buy1 = new OrderBuyStock(stock1);
        Order buy2 = new OrderBuyStock(stock2);
        Order sell1 = new OrderSellStock(stock1);
        Order sell2 = new OrderSellStock(stock2);

        Broker broker = new Broker();
        broker.takeOrder(buy1);
        broker.takeOrder(buy2);
        broker.takeOrder(sell2);
        broker.takeOrder(sell1);

        broker.placeOrders();
    }

}
