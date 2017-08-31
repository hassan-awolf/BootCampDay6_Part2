import java.util.Arrays;

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

}
