import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       int x;
       double y;
       
       Scanner sc = new Scanner(System.in);
       
       x = Integer.parseInt(sc.nextLine());
       y = Double.parseDouble(sc.nextLine());
       
        System.out.println(String.format("%.3f km/l", x/(double)y));
    }
}
