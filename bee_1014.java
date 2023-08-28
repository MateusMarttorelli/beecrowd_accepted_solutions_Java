import java.util.Scanner;

public class bee_1014
{
    public static void main(String[] args)
    {
       int x;
       double y;
       
       Scanner sc = new Scanner(System.in);
       
       x = Integer.parseInt(sc.nextLine());
       y = Double.parseDouble(sc.nextLine());
       
        System.out.printf("%.3f km/l%n", x/ y);
    }
}
