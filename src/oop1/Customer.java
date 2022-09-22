package oop1;

public class Customer {
    private int ID;
    private String customerNumber;
    private String customerMobilePhoneNumber;

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerMobilePhoneNumber() {
        return customerMobilePhoneNumber;
    }

    public void setCustomerMobilePhoneNumber(String customerMobilePhoneNumber) {
        this.customerMobilePhoneNumber = customerMobilePhoneNumber;
    }
}
