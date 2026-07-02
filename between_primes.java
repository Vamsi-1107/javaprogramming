import java.util.*;

public class between_primes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for (int i = low; i <= high; i++)
        {
            int count = 0;
            for (int div = 2; div * div <= i; div++)
            {
                if (i % div == 0)
                {
                    count++;
                    break;
                }
            }
            if (count == 0 && i > 1)
            {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
