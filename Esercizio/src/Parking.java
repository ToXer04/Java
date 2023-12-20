import java.util.ArrayList;
import java.util.Scanner;

public class Parking {
    private ArrayList<ParkingSpot> parkingSpots;

    public Parking(ArrayList<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public ArrayList<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(ArrayList<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "parkingSpots=" + parkingSpots +
                '}';
    }
    public Parking fillParking(int spots) {
        for(int x = 1; x <= spots; x++) {
            ParkingSpot ps = new ParkingSpot(x, true);
            this.getParkingSpots().add(ps);
        }
        return this;
    }
    public ParkingSpot findSpot() throws Exception {
        for(ParkingSpot ps : this.getParkingSpots()) {
            if(ps.getIsEmpty()) {
                return ps;
            }
        }
        throw new Exception("Non ci sono posti disponibili");
    }
    public ParkingSpot checkBuySpot(int ore) throws Exception {
        Scanner in = new Scanner(System.in);
        try {
            ParkingSpot spot = this.findSpot();
            double costo = ore*1.5;
            System.out.println("Il costo è di " + costo);
            System.out.println("Procedere col pagamento? [Y/N]");
            String input = in.nextLine();
            if(input.equals("Y")) {
//                buySpot(costo);
                spot.setIsEmpty(false);
                return spot;
            } else {
                throw new Exception("Pagamento annullato");
            }
        } catch(Exception e) {
            throw new Exception(e);
        }

    }
}
