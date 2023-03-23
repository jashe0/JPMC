import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minNumber = 0;
        int maxNumber = 0;
        int loopCount  = 0;

        while(true){
            try {
                System.out.println("Enter number to continue or any other character to quit");
                String userNumber = scanner.nextLine();
                int number = Integer.parseInt(userNumber);
                if(loopCount == 0 || number < minNumber){
                    minNumber = number;
                }
                if (loopCount == 0 || number > maxNumber){
                    maxNumber = number;
                }
                loopCount++;
            } catch (NumberFormatException n){
                break;
            }
        }

        System.out.println("The max number entered was : "+maxNumber+" The min number entered was : "+minNumber);

    }
}
