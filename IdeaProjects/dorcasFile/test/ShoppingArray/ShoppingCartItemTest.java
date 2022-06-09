package ShoppingArray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartItemTest {
    ShoppingCartItem cartItem;

    @BeforeEach
    void setUp() {
        cartItem = new ShoppingCartItem("Shoe",4,7000);
    }

    @Test

    public void testThatWeHaveShoppingCartItem() {


        assertNotNull(cartItem);
    }
    @Test

    public void testThatWeHaveAnItem(){

        assertEquals("Shoe", cartItem.getItem());



    }
    @Test
    public void testThatWeCanSetQuantity(){

        assertEquals(4, cartItem.getQuantity());

    }
    @Test
    public void testThatWeCanSetPrice(){

        assertEquals(7000, cartItem.getPrice());
    }
}