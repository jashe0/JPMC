import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayToBeSorted = new int[5];
        for(int i = 0; i < arrayToBeSorted.length; i++){
            arrayToBeSorted[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(arrayToBeSorted));

        Arrays.sort(arrayToBeSorted);
        int[] sortedArray = new int[arrayToBeSorted.length];
        for(int i = 0; i < arrayToBeSorted.length; i++){
            int numberStorage = arrayToBeSorted[i];
            sortedArray[i] = arrayToBeSorted[arrayToBeSorted.length -i -1];
            arrayToBeSorted[arrayToBeSorted.length -i -1] =numberStorage;
        }
        System.out.println(Arrays.toString(sortedArray));

    }
}
