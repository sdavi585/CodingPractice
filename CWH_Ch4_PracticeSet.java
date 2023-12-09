import java.util.Scanner;
public class CWH_Ch4_PracticeSet {
    public static void main(String[] args) {
//--------------QUESTION 1-----------------------------------------------//
        int t1, t2, t3;

        Scanner per = new Scanner(System.in);
        System.out.println("Enter 1st score: ");
        t1 = per.nextInt();

        System.out.println("Enter 2nd score: ");
        t2 = per.nextInt();

        System.out.println("Enter 3rd score: ");
        t3 = per.nextInt();

        int sum = (t1 + t2 + t3)/3;

        if (sum > 40){
            System.out.println("You passed!");
        }
        else
            System.out.println("You failed!");
        }
    }

