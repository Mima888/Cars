
public class Car {
    
    String model;
    int maxSpeed;
    int minSpeed;
    double weight;
    
    String licence = "abc123";
    int maxFuel;
    int currentFuel;
    int consumption; //po kilometru
    int mileage = 0;
    
    
    public Car() {
        
        this.model = "default";
        this.maxFuel = 100;
        this.consumption = 5;
        
    }
    
    public Car(String customModel, int customMaxFuel, int customConsumption, String customLicence) {
    
        this.model = customModel;
        this.maxFuel = customMaxFuel;
        this.consumption = customConsumption;
        this.licence = customLicence;
        
    }
    
    public void printAttributes() {
        
        System.out.println("Model: " + this.model);
        System.out.println("Kapacitet rezervoara: " + this.maxFuel);
        System.out.println("Potrosnja: " + this.consumption);
        System.out.println("Registracija: " + this.licence);
        System.out.println("Trenutno stanje rezervoara: " + this.currentFuel);
        System.out.println("Tezina: " + this.weight);
        System.out.println("Ukupna predjena distanca: " + this.mileage);
        System.out.println();
    }
    
    public void changeLicence(String customLicence) {
    
        this.licence = customLicence;
    }
    
    public void changeWeight(double customWeight) {
    
        this.weight = customWeight;
    }
    
    public double maxDistance() {
    
        double dist = this.maxFuel / this.consumption;
        return dist;
        
//        return this.maxFuel / this.consumption
    }
    
    public void fuelUp() {
    
         this.currentFuel = this.maxFuel;
    
    }
    
    public void travel(int distance) {
        
        //ako ima dovoljno goriva za put, onda putuj tj povecaj mileage i smanji trenutno gorivo, 
        // a ako nema dovoljno goriva, onda ispisi poruku da nema dovoljno goriva za put.
        
        if (this.currentFuel >= distance * this.consumption) {
            
            this.mileage = this.mileage + distance;
            this.currentFuel = this.currentFuel - distance * this.consumption;
        } else {
        
            System.out.println("Nema dovoljno goriva za taj put");
        }
        
        
    }
    
    
    
}
