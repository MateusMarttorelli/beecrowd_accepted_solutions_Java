import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final double PI = 3.14159;
        double raio, area;
        
        Scanner sc = new Scanner(System.in);
        
        raio = sc.nextDouble();
        
        area = PI * Math.pow(raio, 2);
        
        System.out.printf("A=%.4f\n",area);
    }    
}
