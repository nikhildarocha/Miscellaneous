package Miscellaneous;

/**
 * Created by nikhil on 08-10-2017.
 */
public class SumOfLinearSeries {

    public double calculateSumRecursion(double n){
        double sum = Math.abs((n*(n+1))/2);
        return sum;
    }

    public double calculateSum(double n){
        double sumOther=0;
        for (int i=0; i<= n; i++){
            sumOther = sumOther +i;
        }
        return sumOther;
    }

    public static void main(String[] args) {
        SumOfLinearSeries value = new SumOfLinearSeries();
        System.out.println(value.calculateSumRecursion(100));
        System.out.println(value.calculateSum(100));
    }
}
