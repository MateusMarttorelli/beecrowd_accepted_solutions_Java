import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int min1 = Math.min(x, Math.min(y, z));
        int min2, max;

        if (min1 == x)
        {
            min2 = Math.min(y, z);
            max = Math.max(y, z);
        }
        else if (min1 == y)
        {
            min2 = Math.min(x, z);
            max = Math.max(x, z);
        }
        else
        {
            min2 = Math.min(x, y);
            max = Math.max(x, y);
        }

        System.out.println(min1 + "\n" + min2 + "\n" + max + "\n");
        System.out.println(x + "\n" + y + "\n" + z);
    }
}