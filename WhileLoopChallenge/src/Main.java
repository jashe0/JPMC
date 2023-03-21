public class Main {
    public static void main(String[] args) {

        int j = 4;
        int evenCounter = 0;
        int oddCounter = 0;

        while(j <= 20){
            if (evenCounter >=  5){
                System.out.println("Even total : "+evenCounter+" Odd total: "+oddCounter);
                break;
            }
            j++;
            if(isEvenNumber(j)){
                System.out.println(j);
                evenCounter++;
            }else{
                oddCounter++;
            }
        }
    }

    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
