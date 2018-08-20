/**
 * This application compares several Student-objects each other
 * by different attributes and will give a sorted output.
 *
 * Enjoy the course and feel free to contribute.
 */
package Complex_Numbers;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Cartesian implements IComplex {

    private final double legit;
    private final double imaginary;

    public Cartesian(double newLegit, double newImaginary) {
        this.legit = newLegit;
        this.imaginary = newImaginary;
    }

    @Override
    public double getLegit() {
        return this.legit;
    }

    @Override
    public double getImaginary() {
        return this.imaginary;
    }

    @Override
    public double getDist() {
        return Math.hypot(this.legit, this.imaginary);
    }

    @Override
    public double getPhi() {
        return Math.atan2(this.imaginary, this.legit);
    }

    @Override
    public IComplex add(IComplex newComplex) {
        return new Cartesian(this.legit + newComplex.getLegit(),
                this.imaginary + newComplex.getImaginary());
    }

    @Override
    public IComplex mult(IComplex newComplex) {
        // TODO Auto-generated method stub
        return null;
    }

}
