import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Main_Question3 {

    public static void main (String[] args)
    {
        int[] a = {1,4,6};
        int[] b = {2,3,5,8,10,11};

        System.out.println(Arrays.toString(mergeSortedLists(a,b)));
    }

    public static int[] mergeSortedLists(int[] a, int[] b)
    {
        int[] new_list = new int[a.length+b.length];

        int counta = 0;
        int countb = 0;

        for (int i = 0; i < new_list.length; i++){

            if (counta == a.length)
            {
                for (int j = countb; j < b.length; j++)
                {
                    new_list[i] = b[j];
                    i++;
                }
                return new_list;
            }
            else if (countb == b.length)
            {
                for (int j = counta; j < a.length; j++)
                {
                    new_list[i] = a[j];
                    i++;
                }
                return new_list;
            }

            if (a[counta] < b[countb])
            {
                new_list[i] = a[counta];
                counta++;
            }
            else {
                new_list[i] = b[countb];
                countb++;
            }
        }

        return new_list;

    }

    @Test
    public void testMergeSortedLists()
    {
        assertEquals(Arrays.toString(new int[]{1,2,3,4,5,6}),
                Arrays.toString(mergeSortedLists(new int[]{1,4,6}, new int[]{2,3,5})));
        assertEquals(Arrays.toString(new int[]{1,2,3,4,5,6,7,8,9}),
                Arrays.toString(mergeSortedLists(new int[]{1,4,6}, new int[]{2,3,5,7,8,9})));
        assertEquals(Arrays.toString(new int[]{-2,-1,0,1,2,3,4,5,6}),
                Arrays.toString(mergeSortedLists(new int[]{-2,-1,1,4,6}, new int[]{0,2,3,5})));
        assertEquals(Arrays.toString(new int[]{0,2,3,5}),
                Arrays.toString(mergeSortedLists(new int[]{}, new int[]{0,2,3,5})));
        assertEquals(Arrays.toString(new int[]{}),
                Arrays.toString(mergeSortedLists(new int[]{}, new int[]{})));
    }


}
