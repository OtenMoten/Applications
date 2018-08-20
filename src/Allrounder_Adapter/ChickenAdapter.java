/**
 * This is a example application how to implement a interface in
 * combination with a adapter.
 *
 * Enjoy the course and feel free to contribute.
 */
package Allrounder_Adapter;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class ChickenAdapter implements IAllrounder {

    @Override
    public String giveMe() {
        Chicken myChicken = new Chicken();
        return myChicken.giveEggs();
    }

}
