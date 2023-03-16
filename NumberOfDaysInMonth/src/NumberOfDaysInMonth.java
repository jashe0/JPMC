public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        }else if(year % 4 == 0 && year % 100 != 0){
            return true;
        }else{
            return year % 100 == 0 && year % 400 == 0;
        }
    }

    public static int  getDaysInMonth(int month, int year){

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: {
                if(year<1 || year>99){
                    return -1;
                }else {
                    return 31;
                }
            } case 4: case 6: case 9: case 11: {
                if(year<1 || year>9999){
                    return -1;
                }else {
                    return 30;
                }
            } case 2: {
                if (isLeapYear(year)==true){
                    return 29;
                }else if(isLeapYear(year)==false){
                    return 28;
                }else{
                    return -1;
                }
            } default: {
                return -1;
            }
        }
    }
}
