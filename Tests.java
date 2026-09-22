// Austin Horne
import java.util.Scanner;

public class Tests {

    //private fields
    private double average;
    private int count;

    //constructor
    public Tests(){
        average = 0;
        count = 0;
    }

    //getAverage method
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
            average = sum / count;
        } else {
            average = Double.NaN;
        }
    }

    //toString method
    public String toString(){
        return String.format("the average of the %d scores entered is %.2f", count, average);
    }
}