import java.util.Scanner;

public class Main
{
    public static final double PI = 3.14159;
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double volume = (4/3.0) * PI * Math.pow(raio, 3);
        
        System.out.println(String.format("VOLUME = %.3f", volume));
    } 
}
