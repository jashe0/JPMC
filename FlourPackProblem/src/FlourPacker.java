public class FlourPacker {

    public static boolean canPack (int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }else {
            while (bigCount > 0 && goal >= 5){
                goal -= 5;
                bigCount--;
            }
            if (smallCount >= goal){
                return true;
            }else{
                return false;
            }
        }
    }
}
