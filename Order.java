public class Order {
    private String Id;
    private String product;
    private int quantity;

    public Order(String Id, String product, int quantity) {
        this.Id = Id;
        this.product = product;
        this.quantity = quantity;
    }

    public String getOrderId() {
        return Id;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Order ID: " + Id + ", Product: " + product + ", Quantity: " + quantity;
    }
}