package personal.ivan;

public class Closest3 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,1,3,3,3,3,11,3,4,5,6,6,6,6,6,6,6,6,65,7,8,5,6,5,23,45};
        //int[] arr={0,0,0};
        System.out.println("hh");
        System.out.println(Summ(arr, 1000));
    }

    public static int Summ(int[] nums, int target)
    {
        int minDiff=nums[0]+nums[1]+nums[2];
        int diff=Math.abs(nums[0]+nums[1]+nums[2]-target);
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(Math.abs(nums[i]+nums[j]+nums[k]-target)<diff)
                    {
                        diff = Math.abs(nums[i]+nums[j]+nums[k]-target);
                        minDiff = nums[i]+nums[j]+nums[k];
                    }
                }
            }
        }
        return minDiff;
    }
}
