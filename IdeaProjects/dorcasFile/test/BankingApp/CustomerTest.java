package BankingApp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer;
    @BeforeEach
    void  setCustomer() {
        customer = new Customer("Dorcas",23);
    }

    @AfterEach
    void tearDown() {
        customer.resetId();
    }

    @Test
    void testThatNameExist() {
        String name = customer.getName();
        assertEquals("Dorcas", name);
    }
    @Test
    void testThatWeCanGetAge(){
        int age = customer.getAge();
        assertEquals(23, age);
    }
    @Test
    void  testThatBVNExists(){
        int BVN = customer.getBVN();
        assertEquals(1, BVN);


    }
}