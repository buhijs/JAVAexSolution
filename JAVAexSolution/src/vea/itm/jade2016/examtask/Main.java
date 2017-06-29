package vea.itm.jade2016.examtask;

import vea.itm.jade2016.examtask.deliveryService.DeliveryServiceFacade;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        m.main();
    }

    public void main() {
        // Create a Shop list of products
        ProductList shop = new ProductList();

        // Init shop with items
        shop.addProduct(new Product("A010", 70, 200, "Leap Motion controler"));
        shop.addProduct(new Product("A021", 500, 300, "Nexus 7, Black"));
        shop.addProduct(new Product("D013", 0.50, 1500, "Vishy Classic Still Water 1.5L"));

        // Create a Customer
        Customer customer1 = new Customer("John Doe", "Latvia", "LV", "LV3601", "Ventspils, Inzenieru 101");

        // Create a shopping order for a customer1
        Order order = new Order(customer1);

        // Add some items to order
        order.addItem(new Item(1, shop.getProduct("A010")));
        order.addItem(new Item(1, shop.getProduct("A021")));
        order.addItem(new Item(2, shop.getProduct("D013")));

        // Get UPS Delivery Service, set an order and deliver this order to thecustomer1
        DeliveryServiceFacade deliveryService = new DeliveryServiceFacade("UPS", customer1.getAddress());
        deliveryService.deliverOrder(order);
    }
}
