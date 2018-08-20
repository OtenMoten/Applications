/**
 * Here you can the the effects of the pointer behaviour in Java.
 *
 * Enjoy the course and feel free to contribute.
 */
package Pointer_Variables;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.awt.Color;
import java.util.Objects;

public class Circle {

    int myX, myY;
    double myRadius;
    Color color = Color.BLUE;

    Circle(int newX, int newY, double newRadius) {

        this.myX = newX;
        this.myY = newY;
        this.myRadius = newRadius;

    }

    @Override
    public boolean equals(Object inputObject) {

        //  Returns 'true' if all 3 operations are true.
        //  Returns 'false' even if at least one of three is NOT true.
        return this.myRadius == ((Circle) inputObject).myRadius
                && this.myX == ((Circle) inputObject).myX
                && this.myY == ((Circle) inputObject).myY;

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.myX;
        hash = 47 * hash + this.myY;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.myRadius) ^ (Double.doubleToLongBits(this.myRadius) >>> 32));
        hash = 47 * hash + Objects.hashCode(this.color);
        return hash;
    }

}
