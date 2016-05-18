import java.util.*;

public class M {

    public Set<Integer> createSet() {

        //prepare lotto machine -- changed seed to "nanoTime"
        Random generator = new Random();
        generator.setSeed(System.nanoTime());

        //generate numbers
        Set<Integer> setofSix = new HashSet<>();

        int counter = 0;

        do {
            //generate random nr
            int nr = generator.nextInt(49) + 1;

            //see if number is already in set
            boolean success = setofSix.add(nr);

            if (success) {
                counter++;
                if (counter >= 6) {
                    System.out.println(nr + "\n");
                } else {
                    System.out.print(nr + ":");
                }
            }
        } while (counter < 6);

        return setofSix;

    }

    public int compareSet(Set set1, Set set2) {

        List agencyTicket = new ArrayList(set1);
        List myTicket = new ArrayList(set2);

        int count = 0;

        for (int i = 0; i < agencyTicket.size(); i++) {
            for (int j = 0; j < myTicket.size(); j++) {
                if (agencyTicket.get(i) == myTicket.get(j)) {
                    System.out.println(agencyTicket.get(i) + " = " + myTicket.get(j));
                    count++;
                }
            }
        }

        return count;
    }

}
