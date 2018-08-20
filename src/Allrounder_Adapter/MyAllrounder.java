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
public class MyAllrounder {

    private IAllrounder myAnimal;

    public void setTier(IAllrounder newAnimal) {
        this.myAnimal = newAnimal;
    }

    @Override
    public String toString() {
        return this.myAnimal.giveMe();
    }

}
