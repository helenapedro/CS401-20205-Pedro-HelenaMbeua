package labs.lab3.prob4.models;

public class House extends Property{
    private double lotSize;
    private Address address;

    public House(double lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double computeRent() {
        return 0.1 * lotSize;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
