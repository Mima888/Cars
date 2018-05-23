
/**
 *
 * @author mica
 */
public class Main {

    public static void main(String[] args) {

        Car myCar = new Car();

//        myCar.printAttributes();
//        myCar.changeLicence("edf456");
//        myCar.printAttributes();
//            double distance = myCar.maxDistance();
//            System.out.println("Maksimalna distanca je: " + distance);
        Car audi = new Car("Audi", 50, 2, "cmd789", 1996);

        audi.printAttributes();
//       audi.changeLicence("cmd789");
//       audi.changeWeight(1300);
//       audi.printAttributes();
//        System.out.println("Maksimalna distanca je: " + audi.maxDistance());
        audi.fuelUp();
        audi.printAttributes();
        audi.travel(20);
        audi.printAttributes();
        audi.travel(30);
        audi.printAttributes();

        System.out.println("Trenutno godiste je: " + audi.getYearManufactured());
        audi.checkYearManufactured(audi.getYearManufactured());

        //audi.setYearManufactured(1989);
        //System.out.println("Novo godiste je: " + audi.getYearManufactured());
        //audi.checkYearManufactured(audi.getYearManufactured());
        System.out.println("\n--------------------------------------------------\n");

        Car opel = new Car("Opel", 60, 7, "jkl980", 2010);

        opel.setCurrentFuel(45);
        opel.setWeight(1450.8);
        opel.printAttributes();

        System.out.println("Trenutno godiste je: " + opel.getYearManufactured());
        opel.checkYearManufactured(opel.getYearManufactured());

        //opel.setYearManufactured(1989);
        //System.out.println("Novo godiste je: " + opel.getYearManufactured());
        //opel.checkYearManufactured(opel.getYearManufactured());
    }

}
