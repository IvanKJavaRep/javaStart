import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class InsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(Search(nums, 7));
    }

    public static int Search(int[] nums, int target) {
        int i=0;
        for(i=0; i<nums.length; i++){
            if(target == nums[i]){
                return i;
            }else if(target < nums[i]){
                return i;
            }
            System.out.println(i);
        }
        System.out.println(i);
        return i;
    }

}
