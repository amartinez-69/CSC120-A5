import java.util.ArrayList;

public class Car {

    private ArrayList<Passenger> passengers; 
    int MaxCapacity; 

    public Car(int MaxCapacity){
        this.MaxCapacity = MaxCapacity;
        this.passengers = new ArrayList<Passenger>(MaxCapacity); 
    }

    public int getCapacity(){
        return MaxCapacity;
    }

    public int seatsRemaining(){
        return MaxCapacity - this.passengers.size();
    }

    public void addPassenger(Passenger p){
        if (this.passengers.contains(p)) { // Already on board
            throw new RuntimeException(p.name + " is already in this Car.");
        }
        if (this.passengers.size() >= this.MaxCapacity) { // Car is full
            throw new RuntimeException(p.name + " cannot board this car because it is at maximum capacity");
        }
        this.passengers.add(p);
        System.out.println(p.name + "has successfully boarded this Car");
    }

    public void removePassenger(Passenger p){
        if (!this.passengers.contains(p)) { // Not boarded
            throw new RuntimeException(p.name + " is not on this Car");
        }
        this.passengers.remove(p);
        System.out.println(p.name + " has successfully boarded this Car");
    }

    public void printManifest(){ //prints list of passengers in car
        if(this.passengers.size() <= 0){
            throw new RuntimeException("This Car is empty");
        }
        for(Passenger p : passengers){
            System.out.println(p.name);
        }
    }
    }




