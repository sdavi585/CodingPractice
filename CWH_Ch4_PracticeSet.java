//import java.util.Scanner;
public class CWH_Ch4_PracticeSet {
    public static void main(String[] args) {
//--------------QUESTION 1-----------------------------------------------//
//        int t1, t2, t3;
//
//        Scanner per = new Scanner(System.in);
//        System.out.println("Enter 1st score: ");
//        t1 = per.nextInt();
//
//        System.out.println("Enter 2nd score: ");
//        t2 = per.nextInt();
//
//        System.out.println("Enter 3rd score: ");
//        t3 = per.nextInt();
//
//        int sum = (t1 + t2 + t3)/3;
//
//        if (sum > 40){
//            System.out.println("You passed!");
//        }
//        else
//            System.out.println("You failed!");

//--------------QUESTION 2-----------------------------------------------//
//
//        Scanner income = new Scanner(System.in);
//        System.out.println("Enter your income: ");
//        float userSlab = income.nextFloat();
//
//        if (userSlab < 250000) {
//            System.out.println("You have no tax.");
//        } else if (250000 <= userSlab && userSlab < 500000) {
//            System.out.println("You have a tax of 5%, which is $" + (userSlab * 0.05));
//
//        } else if (500000 <= userSlab && userSlab <= 999999) {
//            System.out.println("You have a tax of 20%, which is $" + (userSlab * 0.2));
//
//        } else if (userSlab >= 1000000) {
//            System.out.println("You have a tax of 30%, which is $" + (userSlab * 0.3));}
//
//        else{
//            System.out.println("Invalid");
//        }

//--------------QUESTION 3-----------------------------------------------//
//        int day = 5 ;
//
//        if (day == 1) {
//            System.out.println("It's Monday");
//
//        } else if (day == 2) {
//            System.out.println("It's Tuesday");
//
//        } else if (day == 3) {
//            System.out.println("It's Wednesday");
//
//        } else if (day == 4) {
//            System.out.println("It's Thursday");
//
//        } else if (day == 5) {
//            System.out.println("It's Friday");
//
//        } else if (day == 6) {
//            System.out.println("It's Saturday");
//
//        } else if (day == 7) {
//            System.out.println("It's Sunday");
//
//        } else {
//            System.out.println("Holiday!");
//        }

//--------------QUESTION 3 (Switch case var)
        int today = 1;

        switch (today) {
            case 1 -> System.out.println("It's Monday");
            case 2 -> System.out.println("It's Tuesday");
            case 3 -> System.out.println("It's Wednesday");
            case 4 -> System.out.println("It's Thursday");
            case 5 -> System.out.println("It's Friday");
            case 6 -> System.out.println("It's Saturday");
            case 7 -> System.out.println("It's Sunday");
            default -> System.out.println("Holiday!");
        }
    }
}