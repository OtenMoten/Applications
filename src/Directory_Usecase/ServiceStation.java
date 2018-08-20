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
public class ServiceStation extends Record {

    private final boolean myRepairState;

    public ServiceStation(String name, String phoneNumber, boolean newState) {
        super(name, phoneNumber);
        this.myRepairState = newState;
    }

    @Override
    public String toString() {
        return super.toString() + " " + ((this.myRepairState) ? "TÜV" : "");
    }

}
