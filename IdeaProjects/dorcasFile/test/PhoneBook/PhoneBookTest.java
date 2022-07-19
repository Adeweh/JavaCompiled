package PhoneBook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PhoneBookTest {

    User user;
    //PhoneBook phoneBook;
    Contact contact;
    Contact contact1;
    Contact contact2;
    Contact contact3;

    @BeforeEach
    void setUp() {
        user = new User("Dee", "12345");
      //  phoneBook = new PhoneBook();
        contact = new  Contact("Seriki","08035869077");
        contact1 = new Contact("Dee","07062828140");
        contact2 = new  Contact("Love","08035869087");
        contact3 = new Contact("Wonders","07062828141");

    }
    @Test
    void testThatUserHasUserNameAndPassWord(){
        assertEquals("Dee", user.getUserName());
        assertTrue( user.checkPassWord("12345"));
    }
    @Test

    void testThatUserHasPhoneBook_phoneBookIsEmpty(){

        assertTrue(user.getPhoneBook().isEmpty());
    }
    @Test
    void testThatUserCanAddToPhoneBook(){
        user.add(contact);
        assertFalse(user.getPhoneBook().isEmpty());
    }
    @Test
    void testThatUserCanAddMultipleEntriesToPhoneBook(){
        user.add(contact);
        user.add(contact1);
        user.add(contact2);

        assertEquals(3, user.getPhoneBook().size());
    }
    @Test
    void  testThatUserCanRemoveEntryFromPhoneBook(){
        user.add(contact);
        user.add(contact1);
        user.add(contact2);


        user.remove(contact1);
        assertEquals(2, user.getPhoneBook().size());
    }

    @Test
    void testThatUserCanGetEntryInfoFromPhoneBook(){
        user.add(contact);
        user.add(contact1);

        assertEquals("07062828140", user.getPhoneBook().getContact(1).getPhoneNumber());
        assertEquals("Seriki", user.getPhoneBook().getContact(0).getContactName());
    }
    @Test
    void testThatUserFindsEntryByName(){
        user.add(contact);
        user.add(contact1);
        user.add(contact2);

        assertEquals("07062828140", user.getContact("Dee").getPhoneNumber() );

    }
    @Test
    void testThatUserFindsEntryByPhoneNumber(){
        user.add(contact);
        user.add(contact1);
        user.add(contact2);

        assertEquals("Seriki", user.getContact("08035869077").getContactName());

    }
    @Test
    void testThatUserCanEditEntry(){
        user.add(contact);
        user.add(contact1);
        user.add(contact2);

        user.getContact("Seriki").setEmailAddress("dee@email.com");
        contact1.setAddress("Yaba");

        assertEquals("dee@email.com", user.getPhoneBook().getContact(0).getEmailAddress());
        assertEquals("Yaba", user.getPhoneBook().getContact(1).getAddress());
    }
    @Test
    void testThatAllEntriesCanBeViewed(){
        user.add(contact);
        user.add(contact1);
        user.add(contact2);
        user.add(contact3);

        Contact[] newContact = {contact, contact1, contact2, contact3};


       // System.out.println(user.getAllContacts());

       assertArrayEquals(newContact, user.getAllContacts());
    }



}
