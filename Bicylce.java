public class Bicylce extends Vehicle {
    private String bikeType;

    public Bicylce() {
        super();
        bikeType = "";
    }

    public String getBikeType() {
        return this.bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public void print() {
        System.out.println("jenis sepeda: " +bikeType);
    }

}
