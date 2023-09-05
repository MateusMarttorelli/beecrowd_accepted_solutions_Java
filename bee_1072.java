import java.util.Scanner;

public class bee_1072
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int x, in = 0, out = 0;

        for (int i = 0; i < n; i++)
        {
            x = Integer.parseInt(sc.nextLine());

            if (10 <= x && x <= 20)
            {
                in++;
            }
            else
            {
                out++;
            }
        }
        System.out.printf("%d in\n%d out\n", in, out);
    }
}
