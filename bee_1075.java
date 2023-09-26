import java.util.Scanner;

public class bee_1075
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 2; i < 10000; i++)
        {
            if (i % n == 2)
            {
                System.out.println(i);
            }
        }
    }
}
