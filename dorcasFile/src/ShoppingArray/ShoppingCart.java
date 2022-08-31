package ShoppingArray;

import java.util.ArrayList;
import java.util.Date;

public class ShoppingCart {
    private ArrayList<ShoppingCartItem> cartItems = new ArrayList<>();

    public void addItems(ShoppingCartItem items){
        cartItems.add(items);

    }
    public void getAllItems(){
        for (int i = 0; i < cartItems.size(); i++) {
            System.out.println(cartItems.get(i).toString());
        }

    }
//    @Override
//    public String toString(){
//        StringBuilder items = new StringBuilder();
//        for (ShoppingCartItem item : cartItems) {
//            String data = """
//                    item name: %s
//                    qty : %d
//                    price %.2f
//                    """.formatted(item.getItem(), item.getQuantity(), item.getPrice());
//            items.append(data);
//        }
//        return items.toString();
//    }


    public double getTotal() {
        double total = 0.0;
        for (int i = 0; i < cartItems.size(); i++) {
            ShoppingCartItem item = cartItems.get(i);
           double price = item.getPrice();
           int qty = item.getQuantity();
           total += price*qty;

        }
        return total;
    }

    public double getDiscount(double discount) {
        double total = getTotal();
        return (discount * total) / 100;
    }

    public double getVat(double vat) {
        double total = getTotal();
        return (vat * total) / 100;
    }
   /* public String toString(){
        System.out.println("""
                OBI COSMETICS
                OLA ULTRA MODERN MARKET
                YABA, LAGOS
                www.olacosmetics.com
                08176345290, 08478321969, 09257349821
                """);
        Date date = new Date();

        System.out.println("SALES INVOICE");

        String header = "   ITEM            QTY     PRICE";

        String totalItems = " ";
        getTotal();

       // ShoppingCartItem items = cartItems.get(int i);


        }

    */
    }




