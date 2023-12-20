public class ParkingSpot {
    private int id;
    private boolean isEmpty;

    public ParkingSpot(int id, boolean isEmpty) {
        this.id = id;
        this.isEmpty = isEmpty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getIsEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(boolean empty) {
        this.isEmpty = empty;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "id=" + id +
                ", isEmpty=" + isEmpty +
                '}';
    }
}
