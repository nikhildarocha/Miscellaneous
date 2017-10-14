package Miscellaneous;

/**
 * Created by nikhil on 07-10-2017.
 */
public class SumOfGeometricSeries {

    public double calculateSeries(double first,double diff, int last){
        double sum =0;

        for (int i=0; i< last; i++){

            sum = sum + first;
            first = first*diff;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfGeometricSeries value = new SumOfGeometricSeries();
        System.out.println(value.calculateSeries(2,2,3));
    }
}
