import java.util.Scanner;

public class driverVehicle {
    private static int harga_awal;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("what vehicle do you want?");
        System.out.println("1.Car / 2.Bicycle");
        int pilihan = in.nextInt();

        if (pilihan == 1) {
            System.out.println("choose 1. if you want Convertible, and choose 2. for no");
            int Convertible = in.nextInt();

            if (Convertible == 1) {
                System.out.println("Num Doors: ");
                int numDoors = in.nextInt();
                System.out.println("Is Electric? ");
                boolean isElectric = in.nextBoolean();
                System.out.println("roof type: ");
                String roofType = in.nextLine();
                System.out.println("numWheels : ");
                int numWheels = in.nextInt();
                System.out.println("price : ");
                double price = in.nextDouble();
                in.nextLine();

            } else if (Convertible == 2) {
                System.out.println("Num Doors: ");
                int numDoors = in.nextInt();
                System.out.println("Is Electric? ");
                boolean isElectric = in.nextBoolean();
                System.out.println("numWheels : ");
                int numWheels = in.nextInt();
                System.out.println("price : ");
                double price = in.nextDouble();

            }

        } else if (pilihan == 2) {
            System.out.println("bike type: ");
            String bikeType = in.nextLine();
            in.nextLine();
        }

        System.out.println("select 1. if you want a discount, 2. if not");
        int diskon = in.nextInt();

        if (diskon == 1) {
            System.out.println("how much discount percentage? ");
            int persen = in.nextInt();
            System.out.println("Harga Awal");
            in.nextLine();

            for (int i = 0; i >= diskon; i++) {
                System.out.println("Masukkan banyak Diskon: ");
                diskon = in.nextInt();
            }
        } else if (diskon == 2) {
            System.out.println();
        }

        diskon = harga_awal / diskon;
        System.out.println("Harga Awal " + harga_awal);
        System.out.println("Diskon " + diskon);
    }

}
