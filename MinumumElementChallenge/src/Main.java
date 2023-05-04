import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int filledUserArray[] = readIntegers(size);

        System.out.println(Arrays.toString(filledUserArray));

        int min = findMin(filledUserArray);
        System.out.println("The minimum element is "+min);



    }

    private static int[] readIntegers(int size){
        Scanner scanner = new Scanner(System.in);
        int[] userArray = new int[size];
        for(int i = 0; i < userArray.length; i ++){
            int userInt = scanner.nextInt();
            userArray[i] = userInt;
        }
        return userArray;
    }

    private static int findMin(int[] userArray){
        int min = userArray[0];
        for(int i = 0; i < userArray.length; i++){
            if(userArray[i] < min){
                min = userArray[i];
            }
        }
        return min;
    }
}
