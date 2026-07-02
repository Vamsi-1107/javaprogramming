import java.util.*;
public class prime {
    public static void main(String args[])
    {
     Scanner sc =new Scanner(System.in);
     int n=sc.nextInt();
     for(int i=0;i<n;i++)
    {
        int a=sc.nextInt();

        int count=0;
        for(int j=2;j*j<=a;j++)
        {
            if(n%j==0)
            {
                count++;
                break;
            }            
        }
        if(count == 0)
        System.out.println("prime");
     else
        System.out.println("not prime");
    } 
    }
}

