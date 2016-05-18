import java.util.Random;

/**
 * Created by Voicu on 5/18/2016.
 */
public class lot2 {
    public static void main(String[] args) {

        boolean[] b= new boolean[49];

        for (int i=0;i<49;i++){
            b[i]=true;
        }

        Random r= new Random();

        int[] n=new int[6];

        for (int i=0;i<6;i++){

            int rand= r.nextInt(49);

            while(b[rand]==false){
                rand++;
                if (rand>=49){
                    rand=0;
                }
            }
            n[i] = rand+1;
            b[rand] = false;     //genau hier ;)
        }

    }
}
