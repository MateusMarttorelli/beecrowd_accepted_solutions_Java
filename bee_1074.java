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
                continue;
            }

            if (x % 2 == 0)
            {
                System.out.print("EVEN ");
            }
            else
            {
                System.out.print("ODD ");
            }

            if (x > 0)
            {
                System.out.println("POSITIVE");
            }
            else
            {
                System.out.println("NEGATIVE");
            }
        }
    }
}
