import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double a, b, c, media;
        
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        media = ((a*2) + (b*3) + (c*5)) / 10;
        
        System.out.println(String.format("MEDIA = %.1f", media));        
    }    
}
