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
public class Calculator {

    private Calculator() {
    }

    public static double getResult(double newDouble_Alpha, double newDouble_Beta, int newInt) {
        return (newDouble_Alpha + newDouble_Alpha) * newInt / 2;
    }

    public static double getResult(double newDouble_Alpha, int newInt, double newDouble_Beta) {
        return newInt * (2 * newDouble_Alpha + newDouble_Beta * (newInt - 1)) / 2;
    }

    public static double getResult(double newDouble, float newFloat, int newInt) {
        return getResult(newDouble, newInt, newFloat);

    }

    public static double getgetResultRestrict(double newDouble_Alpha, double newDouble_Beta, int newInt) {

        if (newDouble_Beta == 1) {
            throw new IllegalArgumentException("Second parameter must not be '1'.");
        }
        double z = newDouble_Alpha * (1 - Math.pow(newDouble_Beta, newInt));
        return z / (1 - newDouble_Beta);

    }

}
