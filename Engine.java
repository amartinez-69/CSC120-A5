public class Engine {
    
    private FuelType typeFuel; //type of fuel used
    double maxFuel; //maxium fuel (100.0)
    double currentFuel; //engine's current fuel level

    public Engine(FuelType typeFuel, double currentFuel){ //sets engine mechanics 
        this.typeFuel = typeFuel; 
        this.currentFuel = currentFuel;

    }

    public void refuel(){ //sets currentFuel to 100.0 
        if(this.currentFuel < 100.0){
            this.currentFuel = 100.0; 
        }
    }

    public void go(){ //decreases currentFuel level by 10.0, prints out fuel level after every decrease
        this.currentFuel = currentFuel -= 10.0; 
        if(this.currentFuel >= 0){
            System.out.println("The current fuel level is " + this.currentFuel);
        }
        else{
            throw new RuntimeException("The train engine is out of fuel. Please refuel."); //When fuel is 0.0, throws exception
        }
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        try {
            while (true) {
                myEngine.go();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); // Out of fuel
        }
        myEngine.refuel(); 
        System.out.println(myEngine.currentFuel);

    }
}