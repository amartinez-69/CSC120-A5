public class Passenger {
    
    String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void boardCar(Car c) { //has passenger board car by calling addPassenger()
        try {
            c.addPassenger(this);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void getOffCar(Car c) { //has passenger get off of a train car by calling removePassenger()
        try {
            c.removePassenger(this);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
