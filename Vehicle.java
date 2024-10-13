
public class Vehicle {
    int numWheels;
    double price;
    
    public Vehicle(int numWheels, double price) {
        this.numWheels = numWheels;
        this.price = price;
        
    }

    public int getNumWheels() {
        return this.numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Vehicle(){
        super();
        numWheels = 0;
        price = 0;
       
    }

    public void print() {
        System.out.println("jumlah roda: " +numWheels);
        System.out.println("harga: " +price);
    }
    
}
