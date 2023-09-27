import java.util.Scanner;

public class bee_1078
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i < 11; i++)
        {
            System.out.printf("%d x %d = %d\n", i, n, (i*n));
        }
    }
}
