package Good_Solutions_Problems;

import java.util.*;

class Trade {
    String stockName;
    int quantity;
    double price;

    public Trade(String stockName, int quantity, double price) {
        this.stockName = stockName;
        this.quantity = quantity;
        this.price = price;
    }
}

class StockMatching {
    Map<String, PriorityQueue<Trade>> buyOrders;
    Map<String, PriorityQueue<Trade>> sellOrders;

    public StockMatching() {
        buyOrders = new HashMap<>();
        sellOrders = new HashMap<>();
    }

    public void addBuyOrder(String stockName, int quantity, double price) {
        Trade trade = new Trade(stockName, quantity, price);
        if (!buyOrders.containsKey(stockName)) {
            buyOrders.put(stockName, new PriorityQueue<>((t1, t2) -> Double.compare(t2.price, t1.price)));
        }
        buyOrders.get(stockName).offer(trade);
        matchOrders(stockName);
    }

    public void addSellOrder(String stockName, int quantity, double price) {
        Trade trade = new Trade(stockName, quantity, price);
        if (!sellOrders.containsKey(stockName)) {
            sellOrders.put(stockName, new PriorityQueue<>((t1, t2) -> Double.compare(t1.price, t2.price)));
        }
        sellOrders.get(stockName).offer(trade);
        matchOrders(stockName);
    }

    private void matchOrders(String stockName) {
        if (buyOrders.containsKey(stockName) && sellOrders.containsKey(stockName)) {
            PriorityQueue<Trade> buyQueue = buyOrders.get(stockName);
            PriorityQueue<Trade> sellQueue = sellOrders.get(stockName);

            while (!buyQueue.isEmpty() && !sellQueue.isEmpty() && buyQueue.peek().price >= sellQueue.peek().price) {
                Trade buyTrade = buyQueue.poll();
                Trade sellTrade = sellQueue.poll();

                int tradeQuantity = Math.min(buyTrade.quantity, sellTrade.quantity);
                double tradePrice = sellTrade.price;

                System.out.println("Matched Trade: Stock " + stockName + ", Quantity " + tradeQuantity + ", Price " + tradePrice);

                buyTrade.quantity -= tradeQuantity;
                sellTrade.quantity -= tradeQuantity;

                if (buyTrade.quantity > 0) {
                    buyQueue.offer(buyTrade);
                }

                if (sellTrade.quantity > 0) {
                    sellQueue.offer(sellTrade);
                }
            }
        }
    }
}

public class StockTradeMatch {
    public static void main(String[] args) {
        StockMatching stockMatching = new StockMatching();

        stockMatching.addBuyOrder("AAPL", 100, 150.0);
        stockMatching.addBuyOrder("AAPL", 50, 140.0);
        stockMatching.addBuyOrder("AAPL", 200, 160.0);

        stockMatching.addSellOrder("AAPL", 150, 160.0);
        stockMatching.addSellOrder("AAPL", 100, 170.0);
    }
}
