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
public class Sheep implements IAllrounder {

    public String giveSpecial() {
        return "Cotton.";
    }

    @Override
    public String giveMe() {
        return giveSpecial();
    }
}
