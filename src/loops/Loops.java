package loops;

public class Loops {

    public static void testWhileLoop() {

        int x = 3;

        while (x > -3) {
            System.out.println("Value of x: " + x);
            x--;
        }
    }

    public static void testForLoop() {

        for (int i = 0; i > 10; i++) {
            System.out.println("Value of i: " + i);
        }
    }

    public static void testDoubleForLoop() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }

        }
    }
    
    public static void printTable() {
        
        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int x = i * j;
                System.out.println(i + " * " + j + " = " + x);
                }
                
            }
        }
    }
    
    // 0 * 0 = 0
    // 0 * 1 = 0
    // ....
    // 1 * 0 = 0
    // 1 * 1 = 1
    // ...
    // 9 * 9 = 81

