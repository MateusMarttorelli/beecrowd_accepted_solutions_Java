import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int a, b, prod;
        
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        prod = a * b;
        
        System.out.println("PROD = " + prod);        
    }    
}
