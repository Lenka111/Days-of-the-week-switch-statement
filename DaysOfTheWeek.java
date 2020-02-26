
//Elena Voinu
import java.util.Scanner;

public class DaysOfTheWeek {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter a number from 1 - 7 to check the day of the week:" +
               "");
        int num = sc.nextInt();


        String[] array = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday", "" +
                "Sunday"};

        dayOfTheWeek( num,array);

        }


//        System.out.println("Enter a number to check the day of the week:" +
//                "");
//        int num = sc.nextInt();
//
//        switch(num){
//            case 1:
//                System.out.println("Selected number: " +num +" for Monday");
//                break;
//            case 2:
//                System.out.println("Selected number: " +num +" for Tuesday");
    //            case 3:
//                System.out.println("Selected number: " +num +" for Wednesday");
//
//                break;
//            default:
//                System.out.println("Invalid value");


 //       }

    public static void dayOfTheWeek(int num, String[]array) {

        if(num <= 0 || num >=8) {
            System.out.println("Invalid value, reenter: ");
            num = sc.nextInt();
        }


            for (int i = 0; i < array.length; i++) {
                //if index number == to user number-1
            if (i == num - 1) {
                //print the day saves at that index
                    System.out.println("You selected " + num + " " + array[i]);
                }
            }
        }
    }


