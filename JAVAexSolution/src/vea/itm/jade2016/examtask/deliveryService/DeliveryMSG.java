package vea.itm.jade2016.examtask.deliveryService;

import java.util.Scanner;
import vea.itm.jade2016.examtask.Main;

public class DeliveryMSG implements DeliveryState {

    Scanner scanner = new Scanner(System.in);
    private String str;

    @Override
    public void stateStatus(String state) {

        if (state.equals("init")) {
            System.out.println("STATUS: Please set order first");
        } else if (state.equals("accepted")) {
            System.out.println("STATUS: Starting delivery");
        } else if (state.equals("dispatched")) {
            System.out.println("STATUS: Order is already dispatched");
        } else if (state.equals("delivered")) {
            System.out.println("STATUS: Order is arrived\nDo you want to purche the same order again?");
            str = scanner.nextLine(); // reads input
            if (str.equals("yes")) {
                //Delivery deliverTo = new Delivery("UPS",customer1.getAddress(),order);
                System.out.println("\n============================================================================================================\n");
                Main m = new Main();
                m.main(); // run again
            }
        }
    }
}
