/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Complex_Numbers;

/**
 *
 * @author Kevin
 */
public class Main {

    public static void main(String[] args) {

        //  Create a object that is type of the interface "IComplex" and
        //  instaciate a Cartesian-object.
        IComplex myComplex = new Cartesian(2, 5);
        System.out.println("CARTESIAN");
        System.out.println("Input A: " + myComplex.getLegit());
        System.out.println("Input B: " + myComplex.getImaginary());
        System.out.println("Dist() = " + myComplex.getDist());
        System.out.println("Phi() = " + myComplex.getPhi());
        System.out.println();

        //  Create a object that is type of the interface "IComplex" and
        //  instaciate a Polar-object.
        myComplex = new Polar(5.385, 1.190);
        System.out.println("POLAR");
        System.out.println("Input A: " + myComplex.getLegit());
        System.out.println("Input B: " + myComplex.getImaginary());
        System.out.println("Dist() = " + myComplex.getDist());
        System.out.println("Phi() = " + myComplex.getPhi());
        System.out.println();

        //  Combine two objects.
        System.out.println("Combine two objects:");
        IComplex myCominationOfBothComplexObjects = myComplex.add(new Polar(3.606, 0.589));
        System.out.println(myCominationOfBothComplexObjects.getLegit());
        System.out.println(myCominationOfBothComplexObjects.getImaginary());

    }

}
