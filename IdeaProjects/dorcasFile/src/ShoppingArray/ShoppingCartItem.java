package ShoppingArray;

public class ShoppingCartItem {
    String item;

    int quantity;

    double price;


    public ShoppingCartItem(String item, int quantity, double price) {
        this.item = item;
        this.quantity = quantity;
        this.price = price;

    }

    public String getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public String toString(){
        return """
                item name: %s
                qty : %d
                price %.2f
                """.formatted(getItem(),getQuantity(),getPrice());
    }


}
