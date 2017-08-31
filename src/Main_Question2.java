import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class Main_Question2 {

    public static void main(String[] args){

        int[] nums = {2,3,4,5,6,7,8};
        int[] nums2 = {1,2,3,4,5,6};

        System.out.println("Hello World");
        System.out.println(Arrays.toString(rotateNums(nums,0)));

        System.out.println(Arrays.toString(rotateNums(nums2,2)));

    }

    /* Accepts parameter int array nums and int k
       Rotates nums to the left by k
       If k is negative, rotates nums to the right by absolute value of k
       Handles all integer values of k
     */
    public static int[] rotateNums (int[] nums, int k)
    {

        if (k < 0)
        {
            int rem = Math.abs(k) % nums.length;
            k = nums.length - rem;
        }
        else if (k > nums.length )
        {
            k = k % nums.length;
        }
        int[] temp = new int[k];

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

    @Test
    public void testRotateNums(){
        assertEquals(Arrays.toString(new int[]{2,3,4,5,6,7,8}), Arrays.toString(rotateNums(new int[]{2,3,4,5,6,7,8}, 0)));
        assertEquals(Arrays.toString(new int[]{2,3,4,5,6,7,8}), Arrays.toString(rotateNums(new int[]{2,3,4,5,6,7,8}, 7)));
        assertEquals(Arrays.toString(new int[]{4,5,6,7,8,2,3}), Arrays.toString(rotateNums(new int[]{2,3,4,5,6,7,8},2)));
        assertEquals(Arrays.toString(new int[]{4,5,6,7,8,2,3}), Arrays.toString(rotateNums(new int[]{2,3,4,5,6,7,8}, 9)));
        assertEquals(Arrays.toString(new int[]{4,5,6,7,8,2,3}), Arrays.toString(rotateNums(new int[]{2,3,4,5,6,7,8}, 16)));
        assertEquals(Arrays.toString(new int[]{7,8,2,3,4,5,6}), Arrays.toString(rotateNums(new int[]{2,3,4,5,6,7,8}, -2)));
    }


}
