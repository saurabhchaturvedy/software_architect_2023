package DesignPatterns.Structural.Facade;

class ShoppingCartFacade {
    private Inventory inventory;
    private PaymentGateway paymentGateway;

    public ShoppingCartFacade(Inventory inventory, PaymentGateway paymentGateway) {
        this.inventory = inventory;
        this.paymentGateway = paymentGateway;
    }

    public boolean addToCart(Product product, int quantity) {
        if (inventory.checkStock(product.getName(), quantity)) {
            inventory.decreaseStock(product.getName(), quantity);
            System.out.println(quantity + " " + product.getName() + "(s) added to cart.");
            return true;
        } else {
            System.out.println("Insufficient stock for " + product.getName());
            return false;
        }
    }

    public void checkout(double totalAmount) {
        paymentGateway.processPayment(totalAmount);
        System.out.println("Checkout completed. Payment of $" + totalAmount + " successfully processed.");
    }
}