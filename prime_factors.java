import java.util.*;
public class prime_factors
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prime = 2;

        while(n != 1) 
        {
            if(n % prime == 0)
            {
                int rem = n / prime;
                n = rem;
                System.out.println(prime);

            }
            else
            {
                prime++;
            }
            
        }
    }
} 


//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
    
//     for(int i=2;i*i <= n;i++)
//     {
//         while(n % i == 0)
//         {
//             n = n / i ;
//             System.out.println(i);
//         }
//     }
//     if(n != 1)
//     {
//         System.out.println(n);
//     }// 
//     }
// }
