public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10 ){
            return -1;
        }else{
                int firstDivisor = 0;
                int secondDivisor = 0;

                for (int i = 0; i < first ; i++){
                    if (first % i == 0){
                       firstDivisor = i;;
                    }
                }

                for (int i = 0; i < second; i++){
                    if(second % i == 0){
                        secondDivisor = i;
                    }
                }

                if(firstDivisor > secondDivisor){
                    return firstDivisor;
                }else{
                    return secondDivisor;
                }
        }
    }
}
