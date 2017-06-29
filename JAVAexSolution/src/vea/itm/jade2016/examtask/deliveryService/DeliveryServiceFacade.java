package vea.itm.jade2016.examtask.deliveryService;

import vea.itm.jade2016.examtask.Order;

public class DeliveryServiceFacade {

    private final DeliveryService deliveryService;

    // Factory Pattern
    public DeliveryServiceFacade(String deliveryMethod, String address) {
        deliveryService = DeliveryServiceFactory.getService(deliveryMethod, address);
    }

    // Facade Pattern
    public void deliverOrder(Order order) {
        // Observer Pattern
        deliveryService.addStatusListener(order.getCustomer());
        deliveryService.setOrder(order);
        deliveryService.deliver();
    }

    public String getStatus() {
        return deliveryService.getStatus();
    }
}
