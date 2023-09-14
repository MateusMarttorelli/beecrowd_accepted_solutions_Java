import java.util.Scanner;

public class bee_1074
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++)
        {
            int x = Integer.parseInt(sc.nextLine());

            if (x == 0)
            {
                System.out.println("NULL");
            }
            else if (x % 2 == 0 && x > 0)
            {
                System.out.println("EVEN POSITIVE");
            }
            else if (x % 2 == 0 && x < 0)
            {
                System.out.println("EVEN NEGATIVE");
            }
            else if (x % 2 != 0 && x > 0)
            {
                System.out.println("ODD POSITIVE");
            }
            else
            {
                System.out.println("ODD NEGATIVE");
            }
        }
    }
}