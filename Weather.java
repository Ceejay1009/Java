import java.util.Scanner;
import java.util.StringTokenizer;

public class Weather {
    public static int[][] temp = new int[12][2];
    public static void getData()
    {
        Scanner sc = new Scanner(System.in);
        for (int m = 0; m < 12; m++)
        {
            System.out.print("Enter high temperature for "+ (m + 1)+"month: ");
            temp[m][0] = sc.nextInt();
        }
        for (int m = 0; m < 12; m++)
        {
            System.out.print("Enter low temperature for "+ (m + 1)+"month: ");
            temp[m][1] = sc.nextInt();
        }
    }

    public static double averageHigh(int temp[][])
    {
        int s = 0;
        int avgHigh = 0;
        for(int i = 0; i<=11; i++)
        {
            s = s + temp[i][0];
        }
        avgHigh = s/12;
        return avgHigh;
    }

    public static double averageLow(int temp[][])
    {
        int s = 0;
        int avgLow = 0;
        for(int i = 0; i < 12; i++)
        {
            s = s + temp[i][1];
        }
        avgLow = s/12;
        return avgLow;
    }

    public static int indexHighTemp(int temp[][])
    {
        int High = 0;
        for(int i = 0; i < 12; i++) {
                if (High < temp[i][0]) {
                    High = temp[i][0];
                }
        }
        return High;
    }

    public static int indexLowTemp(int temp[][])
    {
        int Low = 100;
        for(int i = 0; i < 12; i++)
        {
                if(Low>temp[i][1])
                {
                    Low = temp[i][1];
                }
            }
        return Low;
    }

    public static void main(String args[])
    {
        getData();
        System.out.println("Average High temperaturs: " + averageHigh(temp));
        System.out.println("Average Low temperaturs: " + averageLow(temp));
        System.out.println("The Highest temperaturs: " + indexHighTemp(temp));
        System.out.println("The Lowest temperaturs: " + indexLowTemp(temp));
    }
}
