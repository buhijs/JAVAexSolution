package vea.itm.jade2016.examtask.deliveryService;

import vea.itm.jade2016.examtask.Order;

// Factory Pattern
public interface DeliveryService {

    public void setOrder(Order order);

    public void deliver();

    public String getStatus();

    public double calculateDeliveryCosts();

    public void addStatusListener(DeliveryStatusListener listener);

    public void notifyStatus();
}
