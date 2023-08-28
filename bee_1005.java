import java.util.Scanner;

public class bee_1005
{
    public static void main(String[] args)
    {
        double a, b, media;
        
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextDouble();
        b = sc.nextDouble();
        
        media = ((a*3.5) + (b*7.5)) / 11;
        
        System.out.printf("MEDIA = %.5f%n", media);
    }    
}
