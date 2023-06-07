package DesignPatterns.Structural.Facade;

class Inventory {
    private int stock;

    public Inventory(int initialStock) {
        this.stock = initialStock;
    }

    public boolean checkStock(String productName, int quantity) {
        System.out.println("Checking stock for product: " + productName);
        return stock >= quantity;
    }

    public void decreaseStock(String productName, int quantity) {
        System.out.println("Decreasing stock for product: " + productName);
        stock -= quantity;
    }
}