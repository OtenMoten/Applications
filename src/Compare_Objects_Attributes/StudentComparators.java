/**
 * This application compares several Student-objects each other
 * by different attributes and will give a sorted output.
 *
 * Enjoy the course and feel free to contribute.
 */
package Compare_Objects_Attributes;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.util.Comparator;

class StudentComparatorID implements Comparator<Student> {

    @Override
    public int compare(Student objAlpha, Student objBeta) {
        return objAlpha.getID().compareTo(objBeta.getID());
    }
}

class StudentComparatorName implements Comparator<Student> {

    @Override
    public int compare(Student objAlpha, Student objBeta) {
        return objAlpha.getName().compareTo(objBeta.getName());
    }
}

class StudentComparatorDate implements Comparator<Student> {

    @Override
    public int compare(Student objAlpha, Student objBeta) {
        return objAlpha.getDate().compareTo(objBeta.getDate());
    }
}
