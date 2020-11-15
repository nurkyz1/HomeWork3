import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        boolean num= true;
        int quantity= 0;
        double sum=0 ;
        double [] numbers = {12.78,14.9,-67.8,67.78,87.56,-59.28,836.9,110.78,-201.4,-508.6,445.7,567.1,115.3,558.7,-889.8};

        for (double i:numbers) {

           if (i<0){
             num= true;
           }if (num && i>0 ){
              quantity++;
              sum += i;

            }
        }
        System.out.println( "Среднеее арифметическое - " + sum/quantity);
    }
}
