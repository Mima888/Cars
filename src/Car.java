
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
    int yearManufactured;
    boolean lights;
    int brojPutnika;
    int maxBrojPutnika = 5;

    public Car() {

        this.model = "default";
        this.maxFuel = 100;
        this.consumption = 5;
        this.yearManufactured = 1950;
        this.lights = true;
        this.brojPutnika = 1;

    }

    public Car(String customModel, int customMaxFuel, int customConsumption, String customLicence, int customYearManufactured) {

        this.model = customModel;
        this.maxFuel = customMaxFuel;
        this.consumption = customConsumption;
        this.licence = customLicence;
        this.yearManufactured = customYearManufactured;

    }

    public Car(int brPutnika, int maxPutnici) {

        this.brojPutnika = brPutnika;
        this.maxBrojPutnika = maxPutnici;
    }

    public void printAttributes() {

        System.out.println("Model: " + this.model);
        System.out.println("Kapacitet rezervoara: " + this.maxFuel);
        System.out.println("Potrosnja: " + this.consumption);
        System.out.println("Registracija: " + this.licence);
        System.out.println("Trenutno stanje rezervoara: " + this.currentFuel);
        System.out.println("Tezina: " + this.weight);
        System.out.println("Ukupna predjena distanca: " + this.mileage);
        System.out.println("Godina proizvodnje: " + this.yearManufactured);
        System.out.println("Da li su svetla ukljucena: " + this.lights);
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

    public void checkYearManufactured(int year) {

        if (year < 1990) {
            System.out.println("Auto je oldtimer");

        } else if (year >= 1990 && year <= 2013) {

            System.out.println("Auto je relativno nov");
        } else {

            System.out.println("Auto je nov");
        }
    }

    public void setYearManufactured(int year) {

        this.yearManufactured = year;

    }

    public int getYearManufactured() {

        return this.yearManufactured;
    }

    public void setCurrentFuel(int newFuel) {

        this.currentFuel = newFuel;
    }

    public int getCurrentFuel() {

        return this.currentFuel;
    }

    public void setWeight(double newWeight) {

        this.weight = newWeight;

    }

    public double getWeight() {

        return this.weight;

    }

    public void setLights(boolean newState) {

        this.lights = newState;
    }

    public boolean getLights() {

        return this.lights;
    }

    public void getIn() {
//        if (this.brojPutnika < this.maxBrojPutnika) {
//            this.brojPutnika += 1;
//            System.out.println("Trenutni broj putnika je: " + this.brojPutnika);
//        } else {
//            System.out.println("Dostignut je maksimalni broj putnika, a to je: " + this.maxBrojPutnika);
//        }

        while (this.brojPutnika < this.maxBrojPutnika) {
            this.brojPutnika += 1;
            System.out.println("Trenutni broj putnika je: " + this.brojPutnika);
            if (this.brojPutnika == this.maxBrojPutnika) {
                System.out.println("Dostignut je maksimalni broj putnika, a to je: " + this.maxBrojPutnika);
            }
        }
    }

    public void getOut() {
        if (this.brojPutnika > 0) {
            this.brojPutnika = this.brojPutnika - 1;
            System.out.println("Trenutni broj putnika je: " + this.brojPutnika);
        } else {
            System.out.println("Ostalo je: " + this.brojPutnika + " putnika");
        }
    }

}
