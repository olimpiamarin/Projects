import java.util.Scanner;

/**
 * Created by Voicu on 5/17/2016.
 */
public class User {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Please enter number");
            numbers[i] = input.nextInt();
        }
    }
}
