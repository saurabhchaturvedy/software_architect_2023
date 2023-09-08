package TechInt.LRUCacheImpl;

class Client {
    private String name;
    private double sales;

    public Client(String name, double sales) {
        this.name = name;
        this.sales = sales;
    }

    public String getName() {
        return name;
    }

    public double getSales() {
        return sales;
    }
}