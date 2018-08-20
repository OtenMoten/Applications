/**
 * This is a example application how to implement the different types
 * of collections.
 *
 * Enjoy the course and feel free to contribute.
 */
package Collections_Data;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Car {

    private final String myBrand;
    private final int myDate;
    private final double myPrice;

    public Car(String newName, int newDate, double newLoan) {
        this.myBrand = newName;
        this.myDate = newDate;
        this.myPrice = newLoan;
    }

    public String getBrand() {
        return this.myBrand;
    }

    public Integer getDate() {
        return this.myDate;
    }

    public Double getPrice() {
        return this.myPrice;
    }

    @Override
    public String toString() {
        return this.myBrand + "[" + this.myDate + "]" + ":" + this.myPrice;

    }

}
