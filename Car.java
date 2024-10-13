public class Car extends Vehicle {
    private int numDoors;
    private boolean isElectric;

    public Car(int numWheels, double price, int numDoors2, boolean isElectric2) {
        super(numWheels, price);
        this.numDoors = numDoors2;
        this.isElectric = isElectric2;
    }

    public int getNumDoors() {
        return this.numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public void print() {
        System.out.println("is electric" + isElectric);
        System.out.println("num doors" +numDoors);
        super.print();
    }

}
