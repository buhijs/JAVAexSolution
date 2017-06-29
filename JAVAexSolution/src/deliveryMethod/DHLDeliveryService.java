package deliveryMethod;

import java.util.ArrayList;
import vea.itm.jade2016.examtask.Order;
import vea.itm.jade2016.examtask.deliveryService.DeliveryMSG;
import vea.itm.jade2016.examtask.deliveryService.DeliveryService;
import vea.itm.jade2016.examtask.deliveryService.DeliveryStatusListener;

public class DHLDeliveryService implements DeliveryService {

    private String sourceAddress;
    private Order order = null;
    private String status;

    DeliveryService deliveryService;
    DeliveryMSG msgg = new DeliveryMSG();

    // Observer pattern: array of all subscribed listeners 
    ArrayList<DeliveryStatusListener> listeners = new ArrayList<DeliveryStatusListener>();

    public DHLDeliveryService(String sourceAddress) {
        setSourceAddress(sourceAddress);
        status = "init";
        //notifyStatus();
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    @Override
    public void setOrder(Order order) {
        this.order = order;
        this.status = "accepted";
        notifyStatus();
    }

    @Override
    public void deliver() {
        if (order != null) {

            // Simulate the delivery process (sleep for 10 sec)
            new Thread() {
                public void run() {
                    status = "dispatched";
                    notifyStatus();
                    System.out.println("Started Delivery to: " + order.getCustomer().getAddress() + "\n");
                    //  while(true) {
                    // if(!status.equals("delivered")){
                    //} else { 
                    //      System.out.println("Waiting...\n");
                    //      break; 
                    //   }
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    status = "delivered";
                    notifyStatus();
                }
            }.start();

        }
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public double calculateDeliveryCosts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addStatusListener(DeliveryStatusListener listener) {
        listeners.add(listener);
    }

    @Override
    public void notifyStatus() {
        for (DeliveryStatusListener deliveryStatusListener : listeners) {
            deliveryStatusListener.notify(order, status);
            msgg.stateStatus(status); // prints STATUS
        }
    }

}
