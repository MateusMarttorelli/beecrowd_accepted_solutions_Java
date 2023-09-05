import java.util.Scanner;

public class bee_1073
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++)
        {
            if (i % 2 == 0)
            {
                System.out.printf("%d^2 = %d\n", i, (int)Math.pow(i, 2));
            }
        }
    }
}
