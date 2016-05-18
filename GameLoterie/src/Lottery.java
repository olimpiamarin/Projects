//import static java.lang.System.out;
//import java.util.Scanner;
//import java.util.Random;
//
//public class Lottery {
//    public static void main(String[] args) {
//        int[] numbers = new int[49];     //int[] numbers = new int[49];
//        int[] winningNumbers = new int[6]; //array holding 6 random numbers
//        int[] userNumber = new int[6]; //array holding the input
//
//        Scanner theNumbers = new Scanner(System.in);
//
//        int guesses;
//        int counter = 0;
//        int i;
//
//        out.println("Enter the 6 numbers");
//        for(i = 0; i < userNumber.length; i++){
//            guesses = theNumbers.nextInt();
//            userNumber[i] = guesses;
//           // out.println(userNumber[i]);
//            if(winningNumbers[i] == userNumber[i] ){
//                counter+=1;
//            }
//        }
////        if (counter == 6) {
////            out.println("you won!! COngratulations!");
////        }
////        else
////            out.println("you lose!");
//
//        //generate 6 random numbers
//        for(i = 0; i < winningNumbers.length; i++ ){
//            int randomNums = new Random().nextInt(49) + 1;
//            winningNumbers[i] =  randomNums;
//            System.out.print(winningNumbers[i]+" ");
//        }
//
//
//
//        switch (counter){
//            case 3:
//                System.out.println("cu 3 numere ati castigat la a lV categ ");
//                break;
//            case 4:
//                System.out.println("cu 4 numere ati castigat la a lII categ ");
//                break;
//            case 5:
//                System.out.println("cu 5 numere ati castigat la a lI categ ");
//                break;
//            case 6:
//                System.out.println("cu 6 numere ati castigat la a l categ ");
//                break;
//            default:
//                System.out.println("\nbilet necastigator, mai incercati! ");
//                break;
//
//        }
//    }
//}