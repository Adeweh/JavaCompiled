package PhoneBook;


import java.util.ArrayList;

public class PhoneBook {

    ArrayList <Contact> entries = new ArrayList<Contact>();

    public boolean isEmpty() {
        return entries.isEmpty();
    }

    public void add(Contact contact) {
        entries.add(contact);

    }

    public int size() {
        return entries.size();
    }

    public void remove(Contact contact) {
        entries.remove(contact);
    }

    public Contact getContact(int index) {
       return entries.get(index);

    }

    public Contact getContact(String info) {
        for (int i = 0; i < entries.size(); i++) {
            if (info.equalsIgnoreCase(getContact(i).getContactName())){
                return getContact(i);
            }
            else if (info.equalsIgnoreCase(getContact(i).getPhoneNumber())) {
                return getContact(i);
            }
        }
        return null;
    }

    public Contact[] getAllContacts() {
        Contact [] allContact = new Contact[size()];
        for (int i = 0; i < size(); i++) {
            allContact[i]= entries.get(i);
        }
        return allContact;
    }
}
