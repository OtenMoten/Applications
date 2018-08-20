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
public class Main {

    public static void main(String[] args) {

        Circle circle_Alpha = new Circle(10, 20, 4);
        Circle circle_Beta = new Circle(30, 30, 6);
        Circle circle_Gamma = new Circle(30, 30, 6);

        System.out.println(circle_Alpha.equals(circle_Beta)); // true
        System.out.println(circle_Beta.equals(circle_Gamma)); // false

        System.out.println();

        A a1 = new A(10);
        A a2 = new A(10);
        A a3 = a2;
        System.out.println(a1 == a2);
        System.out.println(a1 == a3);
        System.out.println(a2 == a3);
        System.out.println(a2);
        System.out.println(a3);

    }

}
