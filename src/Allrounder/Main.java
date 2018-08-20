/**
 * This is a example application how to implement a interface.
 *
 * Enjoy the course and feel free to contribute.
 */
package Allrounder;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Main {

    public static void main(String[] args) {

        MyAllrounder myAllrounder = new MyAllrounder();

        myAllrounder.setAnimal(new Chicken());
        System.out.print("My allrounder is giving: ");
        System.out.println(myAllrounder.toString());

        System.out.println();

        myAllrounder.setAnimal(new Sheep());
        System.out.print("My allrounder is giving: ");
        System.out.println(myAllrounder.toString());
        
    }

}
