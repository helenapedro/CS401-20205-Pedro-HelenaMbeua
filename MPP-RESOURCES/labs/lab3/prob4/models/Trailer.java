package labs.lab3.prob4.models;

public class Trailer extends Property {
    private static final double RENT = 500;
    private Address address;

    @Override
    public double computeRent() {
        return RENT;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
