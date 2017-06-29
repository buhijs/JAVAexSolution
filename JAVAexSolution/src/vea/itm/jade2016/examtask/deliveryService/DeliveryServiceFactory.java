package vea.itm.jade2016.examtask.deliveryService;

import deliveryMethod.DHLDeliveryService;
import deliveryMethod.DPDDeliveryService;
import deliveryMethod.FedExDeliveryService;
import deliveryMethod.UPSDeliveryService;

// Factory Pattern
public class DeliveryServiceFactory {

    public static DeliveryService getService(String deliveryProvider, String address) {
        if (deliveryProvider.equals("UPS")) {
            return new UPSDeliveryService(address);
        } else if (deliveryProvider.equals("DPD")) {
            return new DPDDeliveryService(address);
        } else if (deliveryProvider.equals("FedEx")) {
            return new FedExDeliveryService(address);
        } else if (deliveryProvider.equals("DHL")) {
            return new DHLDeliveryService(address);
        }
        return null;
    }
}
