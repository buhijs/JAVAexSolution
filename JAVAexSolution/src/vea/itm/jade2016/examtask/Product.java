package vea.itm.jade2016.examtask;

/**
 * Product class holds the information about concrete product available in the
 * shop. Product has 'code' - an identifier of product and 'cost' - cost of one
 * item of the product. 'Weight' is used to calculate Delivery costs.
 *
 * @author Janis
 */
public class Product {

    private String code;
    private double cost;
    private double weight;
    private String info;

    public Product(String code, double cost, double weight, String info) {
        setCode(code);
        setCost(cost);
        setWeight(weight);
        setInfo(info);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
