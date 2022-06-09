package Estore;

public class BillingInfo {
    private int phoneNumber;

    private String receiverName;

    private Addresses deliveryAddress;

    private CreditCardInfo creditCardInfo;

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }


}
