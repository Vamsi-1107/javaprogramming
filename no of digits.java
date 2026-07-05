import java.util.*;
public class no_of_digits {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digits=0;
        while(n !=0)
        {
            n=n/10;
            digits++;

        }
        System.out.println("no.of digits " + digits);
        sc.close();
    }
    
}
