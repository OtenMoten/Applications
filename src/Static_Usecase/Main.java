/**
 * Here you can learn how to deal with the static keyword and overloading.
 *
 * Enjoy the course and feel free to contribute.
 */
package Static_Usecase;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Main {

    public static void main(String[] args) {

        try {
            System.out.println(Calculator.getgetResultRestrict(2.0d, 1.0d, 64));
        } catch (IllegalArgumentException objException) {
            System.out.println(objException.getMessage());
        }

        //  Using "Overloading":
        //  double - double - int
        System.out.println(Calculator.getResult(1.0d, 100.0d, 100));
        //  double - int - double
        System.out.println(Calculator.getResult(1.0d, 1000, 1.0d));
        //  double - float - int
        System.out.println(Calculator.getResult(2.0d, 4.0f, 20));

        //  You can use the same function name but with different parameters.
    }
}
