public class Main {
    public static void main(String[] args){
        String a = getDurationString(3945) ;
        System.out.println(a);
        String b = getDurationString(65,45);
        System.out.println(b);
    }

    public static String getDurationString(int seconds){
        if (seconds >= 0) {
            return getDurationString(seconds/60,seconds%60);
        }else{
            return "Invalid input";
        }
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes >= 0 && seconds >= 0 && seconds <=59){
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            return hours+"h "+remainingMinutes+"m "+seconds+"s";
        }else{
            return "Invalid Input";
        }

    }
}
