

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

        
        
        Car audi = new Car("Audi", 50, 2, "cmd789");
        
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
       
        
    }
    
}
