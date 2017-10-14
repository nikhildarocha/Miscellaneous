package Miscellaneous;

/**
 * Created by nikhil on 08-10-2017.
 */
public class SumOfGeometricSeriesRecursion {

    public double calculateSumofGP(double a, double r, int n){
        return Math.abs((a*(1-Math.pow(r,n)))/(1-r));
    }

    public static void main(String[] args) {
        SumOfGeometricSeriesRecursion value = new SumOfGeometricSeriesRecursion();
        System.out.println(value.calculateSumofGP(2,2,3));
    }
}
