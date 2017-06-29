package vea.itm.jade2016.examtask;

import vea.itm.jade2016.examtask.deliveryService.DeliveryStatusListener;
//Observer patter

public class Customer implements DeliveryStatusListener {

    private String name;
    private String country;
    private String countryCode;
    private String zipCode;
    private String address;

    public Customer() {
    }

    public Customer(String name, String country, String countryCode, String zipCode, String address) {
        setName(name);
        setCountry(country);
        setCountryCode(countryCode);
        setZipCode(zipCode);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void PrintMessage(String msg) {
        System.out.println(name + " is saying: " + msg);
    }

    // Observer Pattern
    @Override
    public void notify(Order order, String status) {

        if (status.equals("delivered")) {
            PrintMessage("Got my package. \n");
        } else {
            System.out.println("Package status: " + status + "\n");
            PrintMessage("Package has not yet arrived. Going home.\n");

        }

    }
}
