package vea.itm.jade2016.examtask.deliveryService;

import vea.itm.jade2016.examtask.Order;

// Observer pattern
public interface DeliveryStatusListener {

    public void notify(Order order, String status);
}
