public class Main {

    public static boolean hasSameLastDigit(int x, int y, int z){

        boolean isDigitMatch = false;

        if(isValid(x) && isValid(y) && isValid(z)){
            int lastXDigit = x % 10;
            int lastYDigit = y % 10;
            int lastZDigit = z % 10;

            if(lastXDigit == lastYDigit || lastYDigit == lastZDigit || lastXDigit == lastZDigit){
                isDigitMatch = true;
            }else{
                isDigitMatch = false;
            }
        }

        return isDigitMatch;

    }

    public static boolean isValid(int number){
        if(number >= 10 && number <= 1000){
            return true;
        } else {
            return false;
        }
    }

}
