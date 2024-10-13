public class Convertible extends Car {
    private String roofType;

    public Convertible(int numWheels, double price, int numDoors2, boolean isElectric2, String roofType) {
        super(numWheels, price, numDoors2, isElectric2);
        this.roofType = roofType;

    }
    public String getRoofType() {
        return this.roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public void print(){
        System.out.println("roof type:" +roofType);
        super.print();
    }
}
