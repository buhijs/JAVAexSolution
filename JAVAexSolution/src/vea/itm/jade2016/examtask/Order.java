package vea.itm.jade2016.examtask;

import java.util.ArrayList;

/**
 * Order class object keeps all the information of a specific order from a
 * specific Customer - customer. Order consists of one or many Items kept in
 * 'orderItems' ArrayList.
 *
 * @author Janis
 */
public class Order {

    private final ArrayList<Item> orderItems = new ArrayList<Item>();
    private Customer customer;

    Order(Customer c) {
        this.customer = c;
    }

    /**
     * Calculate total costs of items in the Order
     *
     * @return total costs
     */
    public double calculateTotalCosts() {
        double totalCosts = 0;
        for (Item item : orderItems) {
            totalCosts += item.getProduct().getCost() * item.getQuantity();
        }
        return totalCosts;
    }

    /**
     * Calculate total weight of all items in the Order (for delivery Service)
     *
     * @return total weight
     */
    public double calculateTotalWeight() {
        double totalWeight = 0;
        for (Item item : orderItems) {
            totalWeight += item.getProduct().getWeight() * item.getQuantity();
        }
        return totalWeight;
    }

    public void removeItem(Item item) {
        orderItems.remove(item);
    }

    public void addItem(Item item) {
        orderItems.add(item);
    }

    public Customer getCustomer() {
        return customer;
    }

}
