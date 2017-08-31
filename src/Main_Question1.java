import org.junit.Test;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Main_Question1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<Integer> list = new ArrayList<>(Arrays.asList(2,3,4,5,6,7));

        System.out.println("Sum of list from for loop: " + getSumForLoop(list) );
        System.out.println("Sum of list from while loop: " + getSumWhileLoop(list) );
        System.out.println("Sum of list from recursion: " + getSumForLoop(list) );
        System.out.println("Sum of list from recursion: " + getSumRecursion(list) );
    }

    /* Returns sum of values in parameter list
       Will handle negative numbers appropriately ( 5 + -4 = 1)
    */
    public static int getSumForLoop(List<Integer> list)
    {
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
        {
            sum += list.get(i);
        }
        return sum;
    }

    /* Returns sum of values in parameter list
       Will handle negative numbers appropriately ( 5 + -4 = 1)
    */
    public static int getSumWhileLoop(List<Integer> list)
    {
        List<Integer> temp = new ArrayList<Integer>(list);

        int sum = 0;
        int index = 0;
        while (!temp.isEmpty())
        {
            sum += temp.remove(index);
        }
        return sum;
    }

    /* Returns sum of values in parameter list
       Will handle negative numbers appropriately ( 5 + -4 = 1)
    */
    public static int getSumRecursion(List<Integer> list)
    {
        if (list.size() > 1)
        {

            return list.get(list.size()-1) + getSumRecursion(list.subList(0,list.size()-1));
        }
        else {
            return list.get(0);
        }
    }

    @Test
    public void testSumForLoop(){
        assertEquals(27, getSumForLoop(new ArrayList<>(Arrays.asList(2,3,4,5,6,7))));
        assertEquals(0, getSumForLoop(new ArrayList<>(Arrays.asList(0,0,0,0,0,0))));
        assertEquals(-5, getSumForLoop(new ArrayList<>(Arrays.asList(10,-3,3,-2,-6,-7))));
    }

    @Test
    public void testSumWhileLoop(){
        assertEquals(27, getSumWhileLoop(new ArrayList<>(Arrays.asList(2,3,4,5,6,7))));
        assertEquals(0, getSumWhileLoop(new ArrayList<>(Arrays.asList(0,0,0,0,0,0))));
        assertEquals(-5, getSumWhileLoop(new ArrayList<>(Arrays.asList(10,-3,3,-2,-6,-7))));
    }

    @Test
    public void testSumRecursion(){
        assertEquals(27, getSumRecursion(new ArrayList<>(Arrays.asList(2,3,4,5,6,7))));
        assertEquals(0, getSumRecursion(new ArrayList<>(Arrays.asList(0,0,0,0,0,0))));
        assertEquals(5, getSumRecursion(new ArrayList<>(Arrays.asList(5))));
        assertEquals(-5, getSumRecursion(new ArrayList<>(Arrays.asList(10,-3,3,-2,-6,-7))));
    }

}
