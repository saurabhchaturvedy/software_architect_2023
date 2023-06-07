package DesignPatterns.Structural.Facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        Product product1 = new Product("Shirt", 29.99);
        Product product2 = new Product("Jeans", 39.99);
        Product product3 = new Product("Shoes", 59.99);

        Inventory inventory = new Inventory(10);
        PaymentGateway paymentGateway = new PaymentGateway();

        ShoppingCartFacade shoppingCart = new ShoppingCartFacade(inventory, paymentGateway);

        shoppingCart.addToCart(product1, 2);
        shoppingCart.addToCart(product2, 1);
        shoppingCart.addToCart(product3, 3);

        shoppingCart.checkout(249.94);
    }
}