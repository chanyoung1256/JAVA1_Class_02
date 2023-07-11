package Class_02;

import java.util.*;

public class ArrayProc {
    public void getValues(int[] array)
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++)
        {
            System.out.print("성적을 입력화시오 : ");
            array[i] = sc.nextInt();
        }
    }

    public double getAverage(int[] array)
    {
        double total = 0;
        for(int i = 0; i < array.length; i++)
        {
            total += array[i];
        }
        return total / array.length;
    }
}
