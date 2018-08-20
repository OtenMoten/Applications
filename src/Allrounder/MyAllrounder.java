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
public class MyAllrounder {

    private IAllrounder myAnimal;

    public void setAnimal(IAllrounder newAnimal) {
        this.myAnimal = newAnimal;
    }

    @Override
    public String toString() {
        return myAnimal.giveMe();
    }
}
