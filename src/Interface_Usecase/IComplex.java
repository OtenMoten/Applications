/**
 * Here you can learn how to implement a interface and deal with classes
 * and objects that have this interface implemented.
 *
 * Enjoy the course and feel free to contribute.
 */
package Interface_Usecase;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public interface IComplex {

    double getLegit();

    double getImaginary();

    double getDist();

    double getPhi();

    IComplex add(IComplex newComplex);

    IComplex mult(IComplex newComplex);

}
