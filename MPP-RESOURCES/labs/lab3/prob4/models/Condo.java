package labs.lab3.prob4.models;

public class Condo extends Property {
    private int numOfFloors;
    private Address address;

    public Condo(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    @Override
    public double computeRent() {
        return 400 * numOfFloors;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
