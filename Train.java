import java.util.ArrayList; 

public class Train {

    private final Engine engine; //train engine
    private ArrayList<Car> cars; //array list of the train's cars

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){ //Train constructor
        this.engine = new Engine(fuelType, fuelCapacity); //initialize engine
        this.cars = new ArrayList<Car>(); //initialize car array 
        for(int i=0; i < nCars; i++){
            this.cars.add(new Car(passengerCapacity)); //initialize train car
        }

    }

    public Engine getEngine(){ //return' train engine
        return engine;
    }
    
    public Car getCar(int i){ //Returns specific train car
        return cars.get(i);
    }

    public int getMaxCapacity(){ //returns total maximum capacity
        int sum = 0;
        for(int i=0; i < cars.size(); i++){
           int carMax = cars.get(i).getCapacity(); 
           sum = sum + carMax; 
        }
        return sum;
    }

    public int seatsRemaining(){ //returns total remaining seats in the train
        int sum = 0;
        for(int i=0; i < cars.size(); i++){
            int carSeats = cars.get(i).seatsRemaining();
            sum = sum + carSeats; 
        }
        return sum;
    }

    public void printManifest(){ //prints information about every passenger
        for(int i=0; i < cars.size(); i++){
            cars.get(i).printManifest();
        }
    }

    }


