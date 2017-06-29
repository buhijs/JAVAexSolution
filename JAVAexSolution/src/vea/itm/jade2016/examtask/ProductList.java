package vea.itm.jade2016.examtask;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * ProductList contains all products available for Customer to buy.
 *
 * @author Janis
 *
 */
public class ProductList {

    private HashMap<String, Product> items;

    ProductList() {
        items = new HashMap<String, Product>();
    }

    public boolean addProduct(Product item) {
        if (item != null) {
            items.put(item.getCode(), item);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeProduct(String code) {
        if (items.containsKey(code)) {
            items.remove(code);
            return true;
        } else {
            return false;
        }
    }

    public Product getProduct(String code) {
        return items.get(code);
    }

    public ArrayList<Product> getAllItems() {
        return new ArrayList<Product>(items.values());
    }

}
