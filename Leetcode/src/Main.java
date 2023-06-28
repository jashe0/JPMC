import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int[] nums = {3,2,4};

        int target = 6;
        int[] answers = twoSum(nums, target );

        for(int a: answers){
            System.out.println(a);
        }


    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            numMap.put(nums[i],i);
        }

        for(int i = 0; i < nums.length; i++){
                int complement = target - nums[i];
                if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                    return new int[]{i, numMap.get(complement)};
            }
        }

        return new int[]{};
    }
}
