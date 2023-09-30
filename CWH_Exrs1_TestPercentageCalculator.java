import java.util.Scanner;

public class CWH_Exrs1_TestPercentageCalculator {

    public static void main(String[] args) {
        Scanner studentsScore = new Scanner(System.in);
        System.out.println("What is the score of subject 1?");
        float sub1 = studentsScore.nextFloat();
        System.out.println("What is the score of subject 2?");
        float sub2 = studentsScore.nextFloat();
        System.out.println("What is the score of subject 3?");
        float sub3 = studentsScore.nextFloat();
        System.out.println("What is the score of subject 4?");
        float sub4 = studentsScore.nextFloat();
        System.out.println("What is the score of subject 5?");
        float sub5 = studentsScore.nextFloat();
        float totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        float finalMarks = totalMarks / 500.0F * 100.0F;
        System.out.println("Your final marks are " + finalMarks + " percent.");
    }
}
