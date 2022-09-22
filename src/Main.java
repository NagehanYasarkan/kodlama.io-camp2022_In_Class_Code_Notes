import oop1.CorporateCustomer;
import oop1.Customer;
import oop1.IndividualCustomer;
import oop1.Product;

public class Main {
    public static void main(String[] args) {


        Product productOne = new Product();
//        set value
//        productOne.name = "DeLonghi Coffee Machine";
//        productOne.unitPrice = 7500;
//        productOne.discount = 7;
//        productOne.unitInStock = 3;
//        productOne.imageUrl = "etcOne.jpg";
        productOne.setName("DeLonghi Coffee Machine");
        productOne.setDiscount(7);
        productOne.setUnitPrice(7500);
        productOne.setUnitInStock(3);
        productOne.setImageUrl("image1.jpg");

//        get value
//        System.out.println(productOne.name);

        Product productTwo = new Product();
//        productTwo.name = "Smeg Coffee Machine";
//        productTwo.unitPrice = 6500;
//        productTwo.discount = 8;
//        productTwo.unitInStock = 2;
//        productTwo.imageUrl = "etcTwo.jpg";
        productTwo.setName("Smeg Coffee Machine");
        productTwo.setDiscount(8);
        productTwo.setUnitPrice(6500);
        productTwo.setUnitInStock(2);
        productTwo.setImageUrl("image2.jpg");


        Product productThree = new Product();
//        productThree.name = "Kitchen Aid Coffee Machine";
//        productThree.unitPrice = 4500;
//        productThree.discount = 9;
//        productThree.unitInStock = 4;
//        productThree.imageUrl = "etcThree.jpg";
        productThree.setName("Kitchen Aid Coffee Machine");
        productThree.setDiscount(9);
        productThree.setUnitPrice(4500);
        productThree.setUnitInStock(4);
        productThree.setImageUrl("image3.jpg");

        Product[] products = {productOne, productTwo, productThree};
        System.out.println("<ul>");

        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");


        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setID(1);
        individualCustomer.setCustomerMobilePhoneNumber("05002342343");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Nagehan");
        individualCustomer.setLastName("Yasarkan");


        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setID(2);
        corporateCustomer.setCompanyName("NY");
        corporateCustomer.setTaxNumber("102093746838");
        corporateCustomer.setCustomerMobilePhoneNumber("234924759244");
        corporateCustomer.setCustomerNumber("12833");

        Customer[] customers = {corporateCustomer, individualCustomer};

    }
}