// Austin Horne
import java.util.Scanner;

public class Tests {

    //private fields
    private double ave;
    private int count;

    //constructor
    public Tests(){
        ave = 0;
        count = 0;
    }

    //getAve method
    public void getAverage(){
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        int numScores = 0;

        System.out.println("Please enter test scores (type -1 to quit): ");
        double score = sc.nextDouble();

        while (score != -1){
            sum += score;
            numScores++;

            System.out.println("Please enter test scores (type -1 to quit): ");
            score = sc.nextDouble();
        }

        count = numScores;

        if (count > 0){
            ave = sum / count;
        } else {
            ave = Double.NaN;
        }
    }

    //toString method
    public String toString(){
        return String.format("the average of the %d scores entered is %.2f", count, average);
    }
}