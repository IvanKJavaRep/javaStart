package personal.ivan;

public class TwoSummClass {
    public static void main(String[] args) {
        int[] d = {3,2,4};
        int t =6;
        GetArray(d,t);
    }
    static int[] GetArray(int[] nums, int target)
    {
        int[] arr = new int[2];
        //System.out.println(nums.length-1);
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j <nums.length; j++) {
                   if(nums[i]+nums[j]==target)
                   {
                       System.out.println(nums[i]+nums[j]);
                       arr[0]=i;
                       arr[1]=j;
                       break;
                   }
            }
        }
        return arr;
    }
}
