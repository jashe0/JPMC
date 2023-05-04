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

        System.out.println("The array in reverse is "+Arrays.toString(reverse(filledUserArray)));



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

    private static int[] reverse(int[] userArray){
        int maxIndex = userArray.length - 1;
        int halfLength = userArray.length / 2;
        for(int i = 0; i < halfLength; i++){
            int temp = userArray[i];
            userArray[i] = userArray[maxIndex - i];
            userArray[maxIndex  - i] = temp;
        }
        return userArray;
    }
}
