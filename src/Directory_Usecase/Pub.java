/**
 * Here you can learn how to create a telephone directory application.
 *
 * Enjoy the course and feel free to contribute.
 */
package Directory_Usecase;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Pub extends Record {

    private String myRating = "";

    public Pub(String newName, String newPhoneNumber, int newRating) {

        super(newName, newPhoneNumber);

        if (newRating > 0 && newRating <= 5) {

            for (int i = 1; i <= newRating; i++) {
                this.myRating += "*";
            }

        }

    }

    @Override
    public String toString() {
        return super.toString() + " " + this.myRating;
    }

}
