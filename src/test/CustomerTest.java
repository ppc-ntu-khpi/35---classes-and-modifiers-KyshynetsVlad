package test;

import domain.Customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c = new Customer();

        c.setID(1);
        System.out.println("displayCustomerInfo ID:" +  c.getID());


        c.setIsNew(true);
        System.out.println("Is New:" +  c.getIsNew());


        c.settotal(1000.0F);
        System.out.println("Get Total:" +  c.gettotal());
    }
}
