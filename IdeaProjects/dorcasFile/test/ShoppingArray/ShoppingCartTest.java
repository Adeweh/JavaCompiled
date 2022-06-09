package ShoppingArray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    ShoppingCart shopping;
    @BeforeEach
    void setUp() {

        shopping = new ShoppingCart();

    }
    @Test
    void testThatYouCanAddItem(){
        ShoppingCartItem newCart = new ShoppingCartItem("Bible",1, 500);
        shopping.addItems(newCart);
        newCart = new ShoppingCartItem("spoon",8,90.7);
        shopping.addItems(newCart);

        shopping.getAllItems();
    }

    @Test
    void testForTotal(){
        ShoppingCartItem newCart = new ShoppingCartItem("Bible",1, 500);
        shopping.addItems(newCart);
        newCart = new ShoppingCartItem("spoon",8,90.7);
        shopping.addItems(newCart);

        assertEquals(1225.6, shopping.getTotal());
    }

    @Test
    void testForDiscount(){
        ShoppingCartItem newCart = new ShoppingCartItem("Bible",1, 500);
        shopping.addItems(newCart);
        newCart = new ShoppingCartItem("spoon",8,90.7);
        shopping.addItems(newCart);

        assertEquals(153.2, shopping.getDiscount(12.5));
    }
    @Test
    void  testForVat(){
        ShoppingCartItem newCart = new ShoppingCartItem("Bible",1, 500);
        shopping.addItems(newCart);
        newCart = new ShoppingCartItem("spoon",8,90.7);
        shopping.addItems(newCart);

        assertEquals(214.48,shopping.getVat(17.5));


    }

}