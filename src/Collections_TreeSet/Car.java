/**
 * This is a example application how to implement the different types
 * of collections.
 *
 * Enjoy the course and feel free to contribute.
 */
package Collections_TreeSet;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Car {

    private final String myBrand;
    private final int myDate;
    private final double myPrice;

    public Car(String m, int j, double p) {
        this.myBrand = m;
        this.myDate = j;
        this.myPrice = p;
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
