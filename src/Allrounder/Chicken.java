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
public class Chicken implements IAllrounder {

    public String giveSpecial() {
        return "Eggs.";
    }

    @Override
    public String giveMe() {
        return giveSpecial();
    }

}
