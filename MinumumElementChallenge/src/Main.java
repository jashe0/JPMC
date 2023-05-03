import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int filledUserArray[] = readIntegers();

        System.out.println(Arrays.toString(filledUserArray));

        int min = findMin(filledUserArray);
        System.out.println("The minimum element is "+min);



    }

    private static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        int[] userArray = new int[5];
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
