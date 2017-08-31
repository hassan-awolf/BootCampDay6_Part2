import java.util.Arrays;
import java.util.Collections;

public class Main_Question2 {

    public static void main(String[] args){

        int[] nums = {2,3,4,5,6,7,8};
        int[] nums2 = {1,2,3,4,5,6};

        System.out.println("Hello World");
        System.out.println(Arrays.toString(rotateNums(nums,2)));

        System.out.println(Arrays.toString(rotateNums(nums2,2)));

    }

    public static int[] rotateNums (int[] nums, int k)
    {
        int[] temp = new int[k];
        if (k > )
        for (int i = 0; i < k; i++)
        {
            temp[i] = nums[i];
        }

        for (int j = k; j < nums.length; j++)
        {
            nums[j-k] = nums[j];
        }
        int temp_index = 0;
        for (int index = nums.length - k; index < nums.length; index++)
        {
            nums[index] = temp[temp_index];
            temp_index++;
        }
        return nums;
    }


}
