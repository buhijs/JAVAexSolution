package vea.itm.jade2016.examtask;

public class Item {

    private int quantity;
    private Product product;

    public Item(int quantity, Product product) {
        setQuantity(quantity);
        setProduct(product);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }


}
