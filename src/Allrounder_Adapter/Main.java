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
public class Main {

    public static void main(String[] args) {

        MyAllrounder myAllrounder = new MyAllrounder();
        ChickenAdapter myChicken = new ChickenAdapter();
        SheepAdapter mySheep = new SheepAdapter();

        myAllrounder.setTier(myChicken);
        System.out.print("My allrounder can give: ");
        System.out.println(myAllrounder.toString());

        System.out.println();

        myAllrounder.setTier(mySheep);
        System.out.print("My allrounder can give: ");
        System.out.println(myAllrounder.toString());

    }

}
