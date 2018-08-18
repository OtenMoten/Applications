/*
 * --
 * 
 */
package Coefficient;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Main {

    public static void main(String[] args) {

        int potenz = 20;

//	 System.out.println(BinKoeff.binCoeff(potenz, 3));
//	 System.out.println(BinKoeff.binKo(potenz, 2));
        System.out.println();

        for (int i = 0; i <= potenz; i++) {
            System.out.print(Coefficient.binCoeff(potenz, i) + "  ");
        }
        System.out.println();

//	 for (int i = 0; i<=potenz; i++){
//		 System.out.print(BinKoeff.binKo(potenz, i) + "  ");
//	 }
    }
}
