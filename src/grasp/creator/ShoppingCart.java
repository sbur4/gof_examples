package grasp.creator;

class ShoppingCart {
    public CartItem createCartItem(Product product) {
        return new CartItem(product);
    }
}

class CartItem {
    private Product product;

    public CartItem(Product product) {
        this.product = product;
    }
}

class Product {
    // Product details
}