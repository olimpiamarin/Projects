import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Voicu on 5/18/2016.
 */
public class lot1 {
    public static void main(final String[] args) throws InterruptedException
    {
        final List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 49; i++)
        {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        System.out.println(Arrays.deepToString(numbers.subList(0, 6).toArray()));
    }
}
