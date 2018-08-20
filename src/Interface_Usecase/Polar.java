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
public class Polar implements IComplex {

    private double dist, phi;

    public Polar(double newDist, double newPhi) {
        this.dist = newDist;
        this.phi = newPhi;
    }

    @Override
    public double getLegit() {
        return this.dist * Math.cos(this.phi);
    }

    @Override
    public double getImaginary() {
        return this.dist * Math.sin(this.phi);
    }

    @Override
    public double getDist() {
        return this.dist;
    }

    @Override
    public double getPhi() {
        return this.phi;
    }

    @Override
    public IComplex add(IComplex newComplex) {

        return new Polar(Math.hypot( /* Parameter 1 */
                /* Parameter 1.A */
                this.getLegit() + newComplex.getLegit(),
                /* Parameter 1.B */
                this.getImaginary() + newComplex.getImaginary()),
                Math.atan2( /* Parameter 2 */
                        /* Parameter 2.A */
                        getImaginary() + newComplex.getImaginary(),
                        /* Parameter 2.B */
                        this.getLegit() + newComplex.getLegit()));

    }

    @Override
    public IComplex mult(IComplex newComplex) {
        return null;
    }

}
