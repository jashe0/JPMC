public class Main {

    public static boolean hasSharedDigit(int firstNumber, int secondNumber){

        boolean isMatch = false;

        if((firstNumber >= 10 && firstNumber <= 99) && (secondNumber >= 10 && secondNumber <= 99)){
            int firstNumberFirstDigit = firstNumber / 10;
            int firstNumberSecondDigit = firstNumber % 10;
            int secondNumberFistDigit = secondNumber / 10;
            int secondNumberSecondDigit = secondNumber % 10;

            if(firstNumberFirstDigit == secondNumberFistDigit || firstNumberSecondDigit == secondNumberSecondDigit ||
            firstNumberSecondDigit == secondNumberFistDigit){
                isMatch = true;
            }else{
                isMatch = false;
            }
        }

        return isMatch;
    }
}
