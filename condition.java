public class condition {
    public static void main(String args[])
    {
        int marks= 100;
        if (marks>90)
            System.out.println("excelent");
        else if (marks > 80)
            System.out.println("good");
        else if (marks >70)
            System.out.println("fair");
        else if (marks>60)
            System.out.println("meets expectation");
        else if (marks<=60)
            System.out.println("below");
        else
            System.out.print("inavalid marks");
    }
    
}
