import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Play implements Runnable {

    private static boolean winner;
    private static int totalTimesPlayed;
    private static int categIV = 0;
    private static int categIII = 0;
    private static int categII = 0;
    private static int nrOfTicketsPlayed;

    private static M numbers = new M();
    private static Set agencyNumbers = numbers.createSet();
    private static Scanner input = new Scanner(System.in);

    @Override
    public void run() {

        do {

            System.out.println("Intrdu nr biletelor pe care vrei sa le joci: ");
            int max = input.nextInt();
            int automatedResult;

            do {
                Set myNumbers = numbers.createSet();
                automatedResult = numbers.compareSet(agencyNumbers, myNumbers);
                checkResult(automatedResult);

            } while (nrOfTicketsPlayed < max && automatedResult != 6);

            nrOfTicketsPlayed = 0;

            checkGameStats();

            System.out.println("Continua? Y/N");

        } while (input.next().trim().toLowerCase().charAt(0) == 'y');

        manualPick();

    }

    private static void checkResult(int result) {
        totalTimesPlayed++;
        nrOfTicketsPlayed++;

        switch (result) {
            case 3:
                if (categIV == 0) {
                    categIV = totalTimesPlayed;
                    System.out.println("castigator la categoria IV");
                    break;
                }
                break;
            case 4:
                if (categIII == 0) {
                    categIII = totalTimesPlayed;
                    System.out.println("castigator la categoria III");
                    break;
                }
                break;
            case 5:
                if (categII == 0) {
                    categII = totalTimesPlayed;
                    System.out.println("castigator la categoria II");
                    break;
                }
                break;
            case 6:
                winner = true;
                System.err.println("Wiiiiiii! Marele Castigator!!!");
                break;
        }
    }

    private static void checkGameStats() {
        System.out.println("Salut, pentru a castiga \n" +
                "\t3 numere am jucat " + categIV + " de variante simple \n" +
                "\t4 numere am jucat " + categIII + " de variante simple \n" +
                "\t5 numere am jucat " + categII + " de variante simple\n\n");

    }

    private static void manualPick() {
        System.out.println("Incearca manual? Y/N");

        if (input.next().trim().toLowerCase().charAt(0) == 'y') {
            do {
                //setup for manual pick
                System.err.println("Numere lotto: " + agencyNumbers);

                Set<Integer> manualNumbers = new HashSet<>();

                System.out.println("Adauga numere:");
                for (int i = 0; i < 6; i++) {
                    try {
                        manualNumbers.add(input.nextInt());
                    } catch (InputMismatchException e) {
                        System.out.println("Introdu doar numere intregi!");
                    }
                }

                System.out.println("Biletul tau: " + manualNumbers);

                int manualResult = numbers.compareSet(agencyNumbers, manualNumbers);

                checkResult(manualResult);
                checkGameStats();

                System.out.println("Mai baga un bilet? Y/N");

            } while (input.next().trim().toLowerCase().charAt(0) == 'y');
        }
    }

    private void lucky() {
        Thread t1 = new Thread(this);
        t1.start();

//        Thread t2 = new Thread(this);
//        t2.start();
    }

    public static void main(String[] args) {
        Play play = new Play();
        play.lucky();

    }
}