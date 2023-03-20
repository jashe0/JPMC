public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(13,13));
    }

    public static boolean isOdd(int number) {
       if(number > 0) {
           if (number % 2 == 0) {
               return false;
           } else {
               return true;
           }
       } else {
           return false;
       }
    }

    public static int sumOdd (int start, int end){
        int sum = 0;
        if (end >= start && start > 0 && end > 0) {
            for (int i=start; i <= end; i++) {
                if (isOdd(i) == true) {
                    sum += i;
                }
            } return sum;
        }else{
            return -1;
        }
    }
}
