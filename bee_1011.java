import java.util.Scanner;

public class bee_1011
{
    public static final double PI = 3.14159;
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double volume = (4/3.0) * PI * Math.pow(raio, 3);
        
        System.out.printf("VOLUME = %.3f%n", volume);
    } 
}
