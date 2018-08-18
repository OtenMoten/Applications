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
import java.math.BigInteger;

public class Coefficient {

    public static BigInteger binCoeff(int n, int k) {
        if ((n < 0) || (k < 0) || (k > n)) {
            throw new IllegalArgumentException(n + ", " + k);
        }

        if (2 * k > n) {
            k = n - k;
        }

        BigInteger result = BigInteger.ONE;

        for (int i = n - k + 1; i <= n; i++) {
            result = result.multiply(new BigInteger(Integer.toString(i)));
        }
        for (int i = 2; i <= k; i++) {
            result = result.divide(new BigInteger("" + i));
        }

        return result;
    }

    static long binaryCoefficient_Alpha(long n, long k) {
        if (k == 0) {
            return 1;
        } else if (k > n) {
            return 0;
        } else {
            return binaryCoefficient_Alpha(n - 1, k - 1) + binaryCoefficient_Alpha(n - 1, k);
        }
    }

    public static long binbinaryCoefficient_Beta(int n, int k) {

        if (k == 0) {
            return 1;
        }
        return (n * binbinaryCoefficient_Beta(n - 1, k - 1) / k);

        // if (n<k) return 0;
//		if (k==0 || k==n) return 1;
//		if (k==1) return n;
//		return binKo(n-1,k-1)+binKo(n-1,k);
    }
}
